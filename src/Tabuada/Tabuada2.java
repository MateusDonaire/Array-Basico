package Tabuada;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		// Desenvolva um programa que faça a tabuada de um número qualquer inteiro que
		// será digitado pelo usuário,
		// mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor
		// inicial e final devem ser
		// informados também pelo usuário.

		Scanner scan = new Scanner(System.in);

		int numInicia, numTermina, numTabuada, result = 0;

		System.out.println("TABUADA");
		System.out.print("Digite o número da tabuada: ");
		numTabuada = scan.nextInt();

		System.out.print("Digite o número para iniciar a tabuada: ");
		numInicia = scan.nextInt();

		System.out.print("Digite o número para terminar a tabuada: ");
		numTermina = scan.nextInt();

		System.out.println();
		while (numTermina < numInicia) {
			System.out.println(
					"Valor inválido. O número que termina não pode ser menor do que o que inicia. Tente novamente.");
			System.out.print("Digite o número para terminar a tabuada: ");
			numTermina = scan.nextInt();

		}
		while (numInicia <= numTermina) {
			result = numTabuada * numInicia;

			System.out.println(numTabuada + " X " + (numInicia) + " = " + result);
			numInicia++;

		}
	}

}
