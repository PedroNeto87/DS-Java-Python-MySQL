print('*** Cálculo de IMC ***')
peso = float(input('Por favor, insira seu peso (KG): '))
altura = float(input('Insira sua altura (M): '))
imc = peso/(altura*altura)

print(f'Seu IMC é: {imc:.2f}')