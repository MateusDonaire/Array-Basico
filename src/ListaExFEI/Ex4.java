package ListaExFEI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
		// calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado. (1SM=R$788,00)
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite seu sal�rio: ");
		System.out.print("R$");
		double salarioUsuario = scan.nextDouble();
		
		double salarioMinimo = 778;
		
			if(salarioUsuario < salarioMinimo) {
				System.out.println("Voc� ganha menos que um sal�rio m�nimo");
			}
			if (salarioUsuario == salarioMinimo) {
				System.out.println("Voc� ganha 1 sal�rio m�nimo");
			}
			if (salarioUsuario > salarioMinimo && salarioUsuario < 1000) {
				System.out.println("Voce ganha um pouco mais que 1 sal�rio m�nimo");
			}
		

	}

}