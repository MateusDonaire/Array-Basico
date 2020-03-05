package CaixaEletronico;

import java.util.Scanner;

public class CaixaEletronixo {

	public static void main(String[] args) {
		double valor;
		int n100;
		int n50;
		int n10;
		int n5;
		int n1;
		
		
		System.out.println("  CAIXA ELETRÔNICO");
		System.out.println();
		System.out.println("Valor mínimo: R$10,00 \nValor máximo: R$600");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantia que deseja sacar: R$");
		valor = scan.nextDouble();
		System.out.println();
		
		if(valor < 10 || valor > 600) {
			System.out.println("Valor mínimo: R$10,00 \nValor máximo: R$600");
			
		}else {
		
		n100 = (int) valor / 100;
		valor = valor - (n100 * 100);
		
		n50 = (int) valor / 50;
		valor = valor - (n50 * 50);
		
		n10 = (int) valor / 10;
		valor = valor - (n10 * 10);
		
		n5 = (int) valor / 5;
		valor = valor - (n5 * 5);
		
		n1 = (int) valor / 1;
		valor = valor - (n1 * 1);
		
		if(n100 != 0){
			System.out.println("Notas de R$100: "+n100);
		}
		if(n50 != 0){
			System.out.println("Notas de R$50: "+n50);
		}
		
		if(n10 != 0){
			System.out.println("Notas de R$10: "+n10);
		}
		
		if(n5 != 0){
			System.out.println("Notas de R$5: "+n5);
		}
		
		if(n1 != 0){
			System.out.println("Notas de R$1: "+n1);				
		}
		
		}
		
	}

}
