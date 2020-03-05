package Fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

		int anterior = 1, atual = 0, proximo = 0;
				
		while (proximo <= 100 ) {
			proximo = anterior + atual;

			System.out.print(proximo + " ");

			anterior = atual;
			atual = proximo;

		}
	}

}
