package Tabuada;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		// Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que
		// ser� digitado pelo usu�rio,
		// mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor
		// inicial e final devem ser
		// informados tamb�m pelo usu�rio.

		Scanner scan = new Scanner(System.in);

		int numInicia, numTermina, numTabuada, result = 0;

		System.out.println("TABUADA");
		System.out.print("Digite o n�mero da tabuada: ");
		numTabuada = scan.nextInt();

		System.out.print("Digite o n�mero para iniciar a tabuada: ");
		numInicia = scan.nextInt();

		System.out.print("Digite o n�mero para terminar a tabuada: ");
		numTermina = scan.nextInt();

		System.out.println();
		while (numTermina < numInicia) {
			System.out.println(
					"Valor inv�lido. O n�mero que termina n�o pode ser menor do que o que inicia. Tente novamente.");
			System.out.print("Digite o n�mero para terminar a tabuada: ");
			numTermina = scan.nextInt();

		}
		while (numInicia <= numTermina) {
			result = numTabuada * numInicia;

			System.out.println(numTabuada + " X " + (numInicia) + " = " + result);
			numInicia++;

		}
	}

}
