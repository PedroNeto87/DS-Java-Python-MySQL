import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int resp;
		
		do {
			System.out.print("Descrição do produto: ");
			String nomeProduto = teclado.next();
			
			System.out.print("Deseja cadastrar outro produto? 1-Sim/2-Não ");
			resp = teclado.nextInt();
		}while(resp == 1);
		
		System.out.print("Obrigado por utilizar nosso sistema de cadastros.");
		
		teclado.close();

	}

}
