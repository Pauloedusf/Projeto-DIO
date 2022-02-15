package Arrays;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int contador = 0;
		int maiorNumero = 0;
		int soma = 0;
		do {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			soma = soma + numero;
			System.out.println("Soma dos numeros até o momento é de: " + soma);
			contador++;
			System.out.println("Voce ja digitou " + contador + " numero(s)");
			
		} while (contador < 5);
		System.out.println("O maior numero digitado foi " + maiorNumero);
		System.out.println("A media de numeros escolhido foi de: " + soma / 5);
	}
		
}
