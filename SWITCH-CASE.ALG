Algoritmo "Buscas"
// Descrição   : Exibir respostas para pesquisas
// Autor(a)    : Pedro Neto
// Data atual  : 26/12/2023
Var
// Seção de Declarações das variáveis 
pesquisa: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("O que deseja pesquisar?")
escreval(" ------------ ")
escreval("|   OPÇÕES   |")
escreval(" ------------ ")
escreval("|1 - ANDROID |")
escreval("|2 - WINDOWS |")
escreval("|3 - IOS     |")
escreval(" ------------ ")
leia(pesquisa)

escolha pesquisa

caso "1"
escreval("Sistema utilizado pela maioria dos celulares no mundo.")

caso "2"
escreval("Sistema utilizado pela maioria dos PCs no mundo.")

caso "3"
escreval("Sistema utilizado pela APPLE.")

outrocaso
escreval("Tente novamente")

fimescolha

Fimalgoritmo