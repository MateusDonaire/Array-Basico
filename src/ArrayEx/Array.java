package ArrayEx;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[5];

		System.out.println("Adicione 5 valores ao vetor A");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();

		System.out.println("Adicione 5 valores ao vetor B");
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Posição " + i + ": ");
			vetorB[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("A Soma entre A e B:");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorA[i] + " + " + vetorB[i] + " = " + vetorC[i]);
		}
		System.out.println();
		System.out.println("A Subtração entre A e B:");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.println(vetorA[i] + " - " + vetorB[i] + " = " + vetorC[i]);
		}
		System.out.println();
		System.out.println("A Multiplicação entre A e B:");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println(vetorA[i] + " x " + vetorB[i] + " = " + vetorC[i]);
		}
		System.out.println();
		System.out.println("A Divisão entre A e B:");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
			System.out.println(vetorA[i] + " / " + vetorB[i] + " = " + vetorC[i]);
		}
		scan.close();
	}
}
