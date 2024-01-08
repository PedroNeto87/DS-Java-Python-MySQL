produto = input('Descrição: ')
preco = float(input('Preço: R$'))
quantidade = int(input('Quantidade: '))
totalPagar = preco*quantidade
nomeCliente = input('Nome: ')
doctoCliente = input('CPF: ')

print()

print('PRODUTO: ', produto)
print(f'Preço unitário R${preco:.2f}')
print('Quantidade desejada: ', quantidade)
print(f'TOTAL A PAGAR: R${totalPagar:.2f}')
print('Cliente (Emissão de Nota Fiscal): ', nomeCliente)
print('Documento de identificação: ', doctoCliente)
