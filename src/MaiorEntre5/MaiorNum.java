package MaiorEntre5;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];
		int maior = 0;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite 5 números:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			num[i] = scan.nextInt();

		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maior) {
				maior = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("O maior número é o "+maior);
		System.out.println("O menor número é o "+menor);

	}
}
