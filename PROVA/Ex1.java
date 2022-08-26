import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num, maior=0, menor=0;	
	
	for(int cont = 0; cont < 5; cont++) {
		System.out.println("Informe um valor: ");
		num = sc.nextInt(); 
		if(cont == 0) {
			menor = num;
		}
		if(num>maior) {
			maior = num; 
		} 
		if (num<menor) {
			menor = num;
		}
	}
	
	System.out.println("O maior valor é: " + maior);
	System.out.println("O menor valor é: " + menor);
	
		
	sc.close();
	}
}
