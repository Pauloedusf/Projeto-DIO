package Arrays;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Voce quer a tabuada de qual numero?");
		numero = scan.nextInt();
		
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(i * numero);
		}

	}

}
