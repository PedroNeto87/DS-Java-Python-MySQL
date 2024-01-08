import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double java = 100.00;
		double html = 200.00;
		double python = 300.00;
		
		System.out.print("Insira seu nome: ");
		String nomeAluno = teclado.nextLine();
		System.out.println("Escolha uma opção: 1-Java 2-HTML 3-Python");
		int escolha = teclado.nextInt();
		
		System.out.println("Olá " + nomeAluno + ", você escolheu a opção " + "'" + escolha + "'");
		
		switch(escolha) {
			case 1: System.out.printf("Curso de Java por R$%.2f", java);
					System.out.println();
			break;
			case 2: System.out.printf("Curso de HTML por R$%.2f", html);
					System.out.println();
			break;
			case 3: System.out.printf("Curso de Python por R$%.2f", python);
					System.out.println();
			break;
			default: break;
		}
		
		if(escolha == 1) {
			System.out.print("Quantos acessos deseja adquirir? ");
			int quantidade = teclado.nextInt();
			System.out.printf("O total a pagar é R$%.2f", java*quantidade);
		}else if(escolha == 2){
			System.out.print("Quantos acessos deseja adquirir? ");
			int quantidade = teclado.nextInt();
			System.out.printf("O total a pagar é R$%.2f", html*quantidade);
		}else if(escolha == 3) {
			System.out.print("Quantos acessos deseja adquirir? ");
			int quantidade = teclado.nextInt();
			System.out.printf("O total a pagar é R$%.2f", python*quantidade);
		}else {
			System.out.print("Esta opção é inválida!");
		}
		
		teclado.close();
	}

}
