import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int ano = 1996;
		double porcentagem=0.015;
		double salario = 1000;
		
		while (ano <= 2022) {
			salario += salario * porcentagem;
			porcentagem = porcentagem * 2;
			ano++;
		}
		System.out.println("Salario 2022");
		System.out.printf("%.2f \n", salario);
	sc.close();
	}
}
