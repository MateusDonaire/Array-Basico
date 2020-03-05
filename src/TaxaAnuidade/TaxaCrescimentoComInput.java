package TaxaAnuidade;

import java.util.Scanner;

public class TaxaCrescimentoComInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double paisA;
		double paisB;
		double taxaPa;
		double taxaPb;
		int ano = 0;
		
		System.out.println("Saiba em quanto tempo (em anos) um pais A alcancará o número de habitantes de um pais B");
		System.out.println();
		System.out.print("Digite a população do pais A:");
		paisA = scan.nextDouble();
		System.out.print("Digite a taxa de crescimento anual (ex: 3% = 0,3):");
		taxaPa = scan.nextDouble();
		System.out.println();
		System.out.print("Digite a população do pais B:");
		paisB = scan.nextDouble();
		
		if(paisB > paisA) {
			return;
		}else {
			System.out.println();
			System.out.println("A população do pais B deve ser maior que a do pais A");
			System.out.print("Digite a população do pais B:");
			paisB = scan.nextDouble();
			
		}
		System.out.print("Digite a taxa de crescimento anual (ex: 1,5% = 0,015):");
		taxaPb = scan.nextDouble();
		System.out.println();

		
		while (paisA <= paisB) {
			paisA += paisA * taxaPa;
			paisB += paisB * taxaPb;
			ano += 1;
		}
		System.out.println("Em "+ano+" anos, o pais A alcança o B com "+paisA+" habitantes equanto o B fica com "+paisB+" habitantes");
		
	}

}
