package estruturasDeControle;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int primo = entrada.nextInt();
		System.out.print("O numero " + primo);
		for (int i = primo-1; i > 1; i--) {
			int valor = primo%i;
			switch(valor) {
			case 0:
				System.out.print(" não");
				break;
			}
		}
		System.out.println(" é primo.");
		
		entrada.close();
	}
}
