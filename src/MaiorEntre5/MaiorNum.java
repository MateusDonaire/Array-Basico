package MaiorEntre5;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];
		int maior = 0;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite 5 n�meros:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("N�mero " + (i + 1) + ": ");
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
		System.out.println("O maior n�mero � o "+maior);
		System.out.println("O menor n�mero � o "+menor);

	}
}
