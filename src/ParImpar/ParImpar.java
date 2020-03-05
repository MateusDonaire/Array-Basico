package ParImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int[] impar = new int[10];
		int[] par = new int[10];

		System.out.println("Digite 10 números: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Num " + (i + 1) + ": ");
			num[i] = scan.nextInt();
		}
		System.out.print("Números pares: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				par[i] = num[i];

			}
			if (par[i] != 0) {
				System.out.print(par[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Números impares:");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
			} else {
				impar[i] = num[i];
			}
			if (impar[i] != 0) {
				System.out.print(impar[i] + " ");
			}
		}

	}

}
