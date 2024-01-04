package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Cadastro de Produto");
		System.out.print("Descrição: ");
		produto.nome = teclado.next();
		System.out.print("Preço: R$");
		produto.preco = teclado.nextDouble();
		System.out.print("Quantidade em estoque (UN): ");
		produto.quantidade = teclado.nextDouble();
		
		System.out.println();
		
		System.out.println("O produto '" + produto.nome + ("' foi cadastrado com sucesso!"));
		System.out.printf("Quantidade em estoque (UN): %.0f", produto.quantidade);
		System.out.println();
		System.out.println();
		
		System.out.print("Para adicionar quantidades do produto '" + produto.nome + "' ao estoque, informe: ");
		int quantidade = teclado.nextInt();
		produto.addProduto(quantidade);
		System.out.printf("Estoque atualizado: %.0f", produto.quantidade);
		System.out.println();
		System.out.println();
		
		System.out.print("Para remover quantidades do produto '" + produto.nome + "' do estoque, informe: ");
		quantidade = teclado.nextInt();
		produto.remProduto(quantidade);
		System.out.printf("Estoque atualizado: %.0f", produto.quantidade);
		System.out.println();
		System.out.println();
		
		System.out.printf("Valor total em estoque R$%.2f", produto.preco * produto.quantidade);
		System.out.println();
		System.out.println();
		
		System.out.print("Obrigado por utilizar nosso sistema.");
		
		teclado.close();

	}

}
