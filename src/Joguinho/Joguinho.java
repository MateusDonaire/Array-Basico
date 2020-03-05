package Joguinho;

import java.util.Scanner;

public class Joguinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numMax, numMin, numTentativa;
;
		int numRandom = (int) (Math.random()*10);
		
		System.out.println("Tente acertar o número. Boa sorte !");
		System.out.println();
		
		numMin = numRandom - 8;
		numMax = numRandom + numRandom;
		
		System.out.println("O número está entre "+numMin+" e "+numMax);
		numTentativa = scan.nextInt();
		
		if (numTentativa == numRandom) {
			System.out.println("Uau, você é bom de chute !");
		}else {
			System.out.println("Erroou, o número era "+numRandom );
		}
		
	}

}
