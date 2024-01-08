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



app = QtWidgets.QApplication([])
cadastro = uic.loadUi('cadastro.ui')

cadastro.btnSalvar.clicked.connect(inserir_dados)

cadastro.show()
app.exec()
