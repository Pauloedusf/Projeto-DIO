package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
