Algoritmo "Análise de Notas"
// Descrição   : Calcular a média de um aluno
// Autor(a)    : Pedro Neto
// Data atual  : 26/12/2023
Var
// Seção de Declarações das variáveis 
aluno: caracter
notaA, notaB, media: real
presenca: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o nome do(a) aluno: ")
leia(aluno)

escreva("Insira a primeira nota: ")
leia(notaA)

escreva("Insira a segunda nota: ")
leia(notaB)

escreva("Participação nas aulas (%): ")
leia(presenca)

escreval()

media <- (notaA + notaB) / 2
escreval("A média das notas foi: ", media)

escreval("A participação nas aulas foi: ", presenca, "%")

escreval()

se(media >= 7) e (presenca >= 80) entao
escreva("Aluno(a) aprovado!")

senao
escreva("Aluno(a) reprovado!")

fimse

escreval()

Fimalgoritmo