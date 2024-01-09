from PyQt5 import uic, QtWidgets
import mysql.connector


conexao = mysql.connector.connect(
    host = '127.0.0.1',
    user = 'dev',
    password = '123456',
    database = 'cadastro'
)


def inserir_dados():
    nome = cadastro.txtNome.text()
    cpf = cadastro.txtCpf.text()
    idade = cadastro.txtIdade.text()
    renda = cadastro.txtRenda.text()
    situacao = cadastro.txtSituacao.text()

    cursor = conexao.cursor()

    comando_SQL = 'INSERT INTO clientes(nome, cpf, idade, renda, situacao) VALUES(%s, %s, %s, %s, %s)'
    dados = (str(nome), str(cpf), str(idade), str(renda), str(situacao))

    cursor.execute(comando_SQL, dados)

    conexao.commit()

    cadastro.txtNome.setText('')
    cadastro.txtCpf.setText('')
    cadastro.txtIdade.setText('')
    cadastro.txtRenda.setText('')
    cadastro.txtSituacao.setText('')


def analise():
    renda = float(cadastro.txtRenda.text())
    idade = int(cadastro.txtIdade.text())

    if renda >= 3500 and idade >= 21:
        cadastro.lblAnalise.setText('Seu crédito foi pré aprovado.')
    else:
        cadastro.lblAnalise.setText('Infelizmente seu crédito não foi pré aprovado.')
    

def tela_relatorio():
    relatorio.show()

    cursor = conexao.cursor()
    comando_SQL = 'SELECT * FROM clientes'
    cursor.execute(comando_SQL)

    leitura_clientes = cursor.fetchall()

    relatorio.tableClientes.setRowCount(len(leitura_clientes))
    relatorio.tableClientes.setColumnCount(6)

    for linha in range(0, len(leitura_clientes)):
        for coluna in range(0, 6):
            relatorio.tableClientes.setItem(linha, coluna, QtWidgets.QTableWidgetItem(str(leitura_clientes[linha][coluna])))


id_geral = 0


def tela_edicao():
    global id_geral
    dados = relatorio.tableClientes.currentRow()
    cursor = conexao.cursor()
    cursor.execute('SELECT id FROM clientes')
    leitura_clientes = cursor.fetchall()
    id_ativo = leitura_clientes[dados][0]
    cursor.execute('SELECT * FROM clientes WHERE id=' + str(id_ativo))
    leitura_clientes = cursor.fetchall()

    edicao.show()
    id_geral = id_ativo

    edicao.txtAlterarId.setText(str(leitura_clientes[0][0]))
    edicao.txtAlterarNome.setText(str(leitura_clientes[0][1]))
    edicao.txtAlterarCpf.setText(str(leitura_clientes[0][2]))
    edicao.txtAlterarIdade.setText(str(leitura_clientes[0][3]))
    edicao.txtAlterarRenda.setText(str(leitura_clientes[0][4]))
    edicao.txtAlterarSituacao.setText(str(leitura_clientes[0][5]))


def btn_alterar():
    global id_geral
    id = edicao.txtAlterarId.text()
    nome = edicao.txtAlterarNome.text()
    cpf = edicao.txtAlterarCpf.text()
    idade = edicao.txtAlterarIdade.text()
    renda = edicao.txtAlterarRenda.text()
    situacao = edicao.txtAlterarSituacao.text()

    cursor = conexao.cursor()
    cursor.execute("UPDATE clientes SET id='{}', nome='{}', cpf='{}', idade='{}', renda='{}', situacao='{}' WHERE id='{}'".format(id, nome, cpf, idade, renda, situacao, id_geral))

    edicao.close()
    relatorio.close()
    cadastro.show()

    conexao.commit()


def excluir_dados():
    excluir = relatorio.tableClientes.currentRow()
    relatorio.tableClientes.removeRow(excluir)

    cursor = conexao.cursor()
    cursor.execute('SELECT id FROM clientes')
    leitura_clientes = cursor.fetchall()
    id_ativo = leitura_clientes[excluir][0]

    cursor.execute('DELETE FROM clientes WHERE id=' + str(id_ativo))

    conexao.commit()


app = QtWidgets.QApplication([])
cadastro = uic.loadUi('cadastro.ui')
cadastro.btnSalvar.clicked.connect(inserir_dados)
cadastro.btnAnalise.clicked.connect(analise)
cadastro.btnRelatorio.clicked.connect(tela_relatorio)

relatorio = uic.loadUi('relatorio.ui')
relatorio.btnEditar.clicked.connect(tela_edicao)
relatorio.btnExcluir.clicked.connect(excluir_dados)

edicao = uic.loadUi('edicao.ui')
edicao.btnAlterar.clicked.connect(btn_alterar)


cadastro.show()
app.exec()