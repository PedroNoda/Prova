package Prova;

import java.util.Scanner;
//Um 
public class Ex2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int ano = 1996;
		double porcentagem=0.015;
		double salario = 1000;
		
		while (ano <= 2022) {
			salario += salario * porcentagem;
			//System.out.println("ano" + ano);
			//System.out.println("%" + porcentagem);
			porcentagem = porcentagem * 2;
			//System.out.printf("%.2f \n", salario);
			ano++;
		}
		System.out.println("Salario 2022");
		System.out.printf("%.2f \n", salario);
	sc.close();
	}
}