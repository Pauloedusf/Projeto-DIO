package Arrays;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidadeNumeros;
		int numero;
		int contador = 0;
		int quantPares = 0;
		int quantImpares = 0;

		System.out.println("Quantidade de numeros é de: ");
		quantidadeNumeros = scan.nextInt();

		do {
			System.out.println("Numero " + contador + ": ");
			numero = scan.nextInt();
			contador++;

			if (numero % 2 == 0) {
				quantPares++;
			} else {
				quantImpares++;
			}

		} while (contador < quantidadeNumeros);

		System.out.println("Quantidades de numeros impares: " + quantImpares);
		System.out.println("Quantidade de numero pares é: " + quantPares);

	}

}
