package Intervalo;

import java.util.Scanner;

public class IntervaloEntreNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inicio;
		int fim;
		int intervalo;

		System.out.print("Digite dois números\nNum 1: ");
		inicio = scan.nextInt();

		System.out.print("Num 2: ");
		fim = scan.nextInt();

		if (fim < inicio) {
			while (fim < inicio) {
				System.out.print("O segundo número deve ser maior que o "+inicio+"\nNum 2: ");
				fim = scan.nextInt();
			}
		}

		System.out.println("O intervalo entre " + inicio + " e " + fim + " é:");
		while (inicio <= fim) {
			intervalo = inicio++;
			System.out.print(intervalo + " ");
		}

	}

}
