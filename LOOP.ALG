Algoritmo "Repetição"
// Descrição   : Exmplo de utilização de LOOP
// Autor(a)    : Pedro
// Data atual  : 26/12/2023
Var
// Seção de Declarações das variáveis 
produtoLoja, loop: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o nome do produto a ser cadastrado: ")
leia(produtoLoja)

escreva ("Deseja inserir mais produtos?(S/N) ")
leia(loop)

enquanto loop = "S" faca

escreva("Digite o nome do produto a ser cadastrado: ")
leia(produtoLoja)

escreva ("Deseja inserir mais produtos?(S/N) ")
leia(loop)

fimenquanto

escreval("Cadastros inseridos com sucesso!")

Fimalgoritmo