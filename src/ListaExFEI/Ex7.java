package ListaExFEI;

public class Ex7 {

	public static void main(String[] args) {

	
			System.out.println("Os número impares de 0 à 30 são:");
			for (int impar = 0; impar < 30; impar++) {
				if (impar % 2 == 0) {
					System.out.print(impar + 1 + " ");
				}
		     }
			System.out.println();
			System.out.println();

			System.out.println("Os números pares de 0 à 30 são:");

			for (int par = 0; par <= 30; par++) {
				if (par % 2 == 0) {
					System.out.print(par+" ");
				}
		}
	}
}
