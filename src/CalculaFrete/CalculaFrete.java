package CalculaFrete;

public class CalculaFrete {

	public double distancia;

	public CalculaFrete(double distancia) {
		this.distancia = distancia;
	}

	public void CalculadorDeFrete() {
		if (distancia < 1000) {
			System.out.println("Frete gratis");
		} else {
			System.out.println("Valor do frete é de R$9,99");
		}
	}

}
