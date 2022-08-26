import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double massa;
		int tempo = 0;
		int hora = 0, minuto = 0, segundo = 0;

		System.out.println("Informe a massa inicial do \ncomponente radioativo (gramas): ");
		massa = sc.nextDouble();

		while (massa >= 0.5) {
			massa = massa / 2;
			tempo = tempo + 50;
		}

		while (tempo >= 3600) {
			hora++;
			tempo = tempo - 3600;
		}

		while (tempo >= 60) {
			minuto++;
			tempo = tempo - 60;
		}

		while (tempo < 60 && tempo >0) {
			segundo++;
			tempo = tempo - 1;
		}
		
		System.out.println("Horas: " + hora + " | Minutos: " + minuto + " | Segundos: " + segundo);

		sc.close();
	}
}
