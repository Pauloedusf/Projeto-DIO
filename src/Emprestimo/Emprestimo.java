package Emprestimo;

public class Emprestimo {

	private int parcelas;
	private double valor;
	
	public int getParcelas() {
		return parcelas;
	}

	public double getValor() {
		return valor;
	}

	public Emprestimo(int parcelas, double valor) {
		this.parcelas = parcelas;
		this.valor = valor;
	}

//	public static void calcular(int parcelas, double valor) {
//		if (parcelas <= 2) {
//			double valorFinal = valor * 1.5;
//			System.out.println("Valor do emprestimo em duas parcelas ou menos é de: R$ " + valorFinal);
//		} else if (parcelas >=3 & parcelas <=10) {
//			double valorFinal = valor *2;
//			System.out.println("Valor do emprestimo em tres ou mais parcelas é de: R$ " + valorFinal);
//		} else {
//			double valorFinal = valor *2.5;
//			System.out.println("Valor do emprestimo em onze parcelas ou mais é de: R$ " + valorFinal);
//		}
//	}
	public void calcular(Emprestimo i) {
		if (i.getParcelas() <= 2) {
			double valorFinal = i.getValor() * 1.5;
			System.out.println("Valor do emprestimo em duas parcelas ou menos é de: R$ " + valorFinal);
		} else if (i.getParcelas()  >=3 & i.getParcelas() <=10) {
			double valorFinal =  i.getValor() *2;
			System.out.println("Valor do emprestimo em tres ou mais parcelas é de: R$ " + valorFinal);
		} else {
			double valorFinal =  i.getValor() *2.5;
			System.out.println("Valor do emprestimo em onze parcelas ou mais é de: R$ " + valorFinal);
		}
	}
	}
