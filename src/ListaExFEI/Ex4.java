package ListaExFEI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
		// calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite seu salário: ");
		System.out.print("R$");
		double salarioUsuario = scan.nextDouble();
		
		double salarioMinimo = 778;
		
			if(salarioUsuario < salarioMinimo) {
				System.out.println("Você ganha menos que um salário mínimo");
			}
			if (salarioUsuario == salarioMinimo) {
				System.out.println("Você ganha 1 salário mínimo");
			}
			if (salarioUsuario > salarioMinimo && salarioUsuario < 1000) {
				System.out.println("Voce ganha um pouco mais que 1 salário mínimo");
			}
		

	}

}