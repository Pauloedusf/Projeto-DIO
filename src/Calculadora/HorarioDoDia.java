package Calculadora;

public class HorarioDoDia {

	public void mensagemHorario(int hora) {
		switch (hora) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			mensagemBomDia();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			mensagemBomTarde();
			break;

		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
			mensagemBoaNoite();
			break;
			default:
				System.out.println("Hora invalida");
				break;
			
		}
	}

	private void mensagemBoaNoite() {
		System.out.println("Boa Noite");
	}

	private void mensagemBomTarde() {
		System.out.println("Boa tarde");
	}

	private static void mensagemBomDia() {
		System.out.println("Bom Dia");
	}
}
