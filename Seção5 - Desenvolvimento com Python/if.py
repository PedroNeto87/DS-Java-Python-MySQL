nomeCliente = input('Informe seu nome: ')
idadeCliente = int(input('Informe sua idade: '))
rendaCliente = float(input('Informe sua renda bruta mensal: R$'))

if rendaCliente >= 2000 and idadeCliente >= 21:
    print(f'Parabéns {nomeCliente}, seu emprestimo foi aprovado!')
else:
    print(f'Sr(a). {nomeCliente}, seu emprestimo foi negado.')
