while True:
    nomeProduto = input('Descrição do Produto: ')
    quantidade = int(input('Quantidade: '))
    preco = float(input('Preço: R$'))
    continuar = input('Deseja inserir mais um cadastro? [S/N]')

    if continuar == 'N':
        break

print(f'Produto: {nomeProduto}')
print(f'Quantidade: {quantidade}')
print(f'Preço: R${preco:.2f}')
