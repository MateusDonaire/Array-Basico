package ListaExFEI;

import java.util.Scanner;

public class Ex5 {
		
		void testaNum(double num1, double num2) {
			if(num1 == num2){
				System.out.println("Ambos números são iguais");
				return;
			}
			else if(num1 > num2 ) {
				System.out.println("O número "+ num1 + " é o maior entre "+ num1 +" e "+ num2);
			}
			else if(num1 < num2 ) {
			}
				System.out.println("O número "+ num2 + " é o maior entre "+ num2 +" e "+ num1);

			}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex5 maiorNum = new Ex5();
		
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite mais um número: ");
		double num2 = scan.nextDouble();
		
		maiorNum.testaNum(num1, num2);
		
	}
		
	}


