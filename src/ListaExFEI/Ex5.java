package ListaExFEI;

import java.util.Scanner;

public class Ex5 {
		
		void testaNum(double num1, double num2) {
			if(num1 == num2){
				System.out.println("Ambos n�meros s�o iguais");
				return;
			}
			else if(num1 > num2 ) {
				System.out.println("O n�mero "+ num1 + " � o maior entre "+ num1 +" e "+ num2);
			}
			else if(num1 < num2 ) {
			}
				System.out.println("O n�mero "+ num2 + " � o maior entre "+ num2 +" e "+ num1);

			}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex5 maiorNum = new Ex5();
		
		System.out.println("Digite um n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite mais um n�mero: ");
		double num2 = scan.nextDouble();
		
		maiorNum.testaNum(num1, num2);
		
	}
		
	}


