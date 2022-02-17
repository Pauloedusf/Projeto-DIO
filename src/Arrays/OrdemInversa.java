package Arrays;

public class OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = { 0, 5, -10, 15, 20 };
		int contador = 0;
		while (contador < vetor.length) {
			System.out.print(vetor[contador] +" ");
			contador++;
		}
		System.out.println(" ");
		System.out.println("Vetor inverso");
		for (int i = vetor.length -1; i >= 0; i--) {
			System.out.print(vetor[i] +" ");
		}
	}

}
