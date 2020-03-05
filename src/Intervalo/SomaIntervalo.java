package Intervalo;

import java.util.Scanner;

public class SomaIntervalo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inicio;
		int fim;
		int intervalo = 0;
		int soma;
		int i;
		
		System.out.print("Digite dois n�meros\nNum 1: ");
		inicio = scan.nextInt();

		System.out.print("Num 2: ");
		fim = scan.nextInt();

		if (fim < inicio) {
			while (fim < inicio) {
				System.out.print("O segundo n�mero deve ser maior que o "+inicio+"\nNum 2: ");
				fim = scan.nextInt();
			}
		}

		System.out.println("O intervalo entre " + inicio + " e " + fim + " �:");
		while (inicio <= fim) {
			intervalo = inicio++;
			System.out.print(intervalo + " ");
		}
		System.out.println();
		System.out.println("A soma entre os n�meros do intervalo �:");
		
		i = inicio;
		soma = inicio;
		fim = Integer.MAX_VALUE;
		while ( inicio <= fim) {
			i++;
			soma+=i;
		}
		System.out.println(soma);
		

	}
		
	}

