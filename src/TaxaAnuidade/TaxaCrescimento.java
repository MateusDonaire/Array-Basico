package TaxaAnuidade;

public class TaxaCrescimento {

	public static void main(String[] args) {
		int paisA = 80000;
		int paisB = 200000;
		int ano = 0;
		
		System.out.println("Considerando o crescimento anual do pais A = 3% e o pais B = 1,5% ");
		System.out.println();
		System.out.println("Inicialmente o pais A tem "+paisA+" habitantes");
		System.out.println("já o pais B tem "+paisB+" habitantes");
		System.out.println();

		
		while (paisA <= paisB) {
			paisA += paisA * 0.3;
			paisB += paisB * 0.015;
			ano += 1;
		}
		System.out.println("Em "+ano+" anos, o pais A alcança o B com "+paisA+" habitantes equanto o B fica com "+paisB+" habitantes");

	}
}
