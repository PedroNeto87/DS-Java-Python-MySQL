import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double preco = 32.99;
		
		System.out.print("Qual seu nome: ");
		String cliente = teclado.nextLine();
		
		System.out.print("Qual a quantidade que deseja: ");
		int quantidade = teclado.nextInt();
		
		System.out.println();
		System.out.println("Olá, " + cliente + "!");
		System.out.println("O valor unitário do produto é R$" + preco);
		System.out.printf("O valor total do pedido foi: " + quantidade + "un X R$" + preco + " = " + "R$%.2f", quantidade * preco);
		
		teclado.close();
	}

}
