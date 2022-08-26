package Prova;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double massa;
	int tempo=0;
	int hora=0, minuto=0, segundo=0;
		
	System.out.println("Informe a massa inicial do \ncomponente radioativo (gramas): ");
		massa = sc.nextDouble();
		 
		while (massa >= 0.5) {
			System.out.println("massa " +massa);
			massa = massa/2;
			System.out.println("massa " +massa);
			System.out.println("--------------------------------");
			System.out.println("tempo " +tempo);
			tempo = tempo + 50;
			System.out.println("tempo " +tempo);
			
			System.out.println("--------------------------------");
		}
		
			while (tempo >= 3600){
				hora++;
				tempo = tempo- 3600;
			}

			while (tempo >= 60){
				minuto++;
				tempo = tempo - 60;
			}
	
			while (tempo < 60) {
				segundo++;
				tempo= tempo-tempo;
			}
		
		System.out.println("Horas: " + hora + " | Minutos: " + minuto +" | Segundos: " + segundo);
		
	sc.close();
	}
}
