import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nomeCliente = teclado.nextLine();
		System.out.print("Informe sua renda bruta: R$");
		double renda = teclado.nextDouble();
		System.out.print("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Olá, " + nomeCliente + "!");
		
		if(renda >= 3000 && idade >= 21) {
			System.out.print("Seu crédito foi aprovado!");
		} else {
			System.out.print("Seu crédito foi negado!");
		}
		
		teclado.close();

	}

}
