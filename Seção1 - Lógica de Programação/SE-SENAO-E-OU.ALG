Algoritmo "An�lise de Notas"
// Descri��o   : Calcular a m�dia de um aluno
// Autor(a)    : Pedro Neto
// Data atual  : 26/12/2023
Var
// Se��o de Declara��es das vari�veis 
aluno: caracter
notaA, notaB, media: real
presenca: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Digite o nome do(a) aluno: ")
leia(aluno)

escreva("Insira a primeira nota: ")
leia(notaA)

escreva("Insira a segunda nota: ")
leia(notaB)

escreva("Participa��o nas aulas (%): ")
leia(presenca)

escreval()

media <- (notaA + notaB) / 2
escreval("A m�dia das notas foi: ", media)

escreval("A participa��o nas aulas foi: ", presenca, "%")

escreval()

se(media >= 7) e (presenca >= 80) entao
escreva("Aluno(a) aprovado!")

senao
escreva("Aluno(a) reprovado!")

fimse

escreval()

Fimalgoritmo