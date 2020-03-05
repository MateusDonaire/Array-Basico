package Tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tabuada = 10;
		int result = 0, num;

		System.out.print("TABUADA !\nDigite um número de 1 à 10:");
		num = scan.nextInt();
		System.out.println();
		if (num > 0 && num <= tabuada) {
			for (int i = 1; i <= tabuada; i++) {
				result = num * i;
				System.out.println(num + " x " + i + " = " + result);
			}
		} else {
			System.out.print("Valor inválido.");

		}
	}
}
