package Joguinho;

import java.util.Scanner;

public class Joguinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numMax, numMin, numTentativa;
;
		int numRandom = (int) (Math.random()*10);
		
		System.out.println("Tente acertar o n�mero. Boa sorte !");
		System.out.println();
		
		numMin = numRandom - 8;
		numMax = numRandom + numRandom;
		
		System.out.println("O n�mero est� entre "+numMin+" e "+numMax);
		numTentativa = scan.nextInt();
		
		if (numTentativa == numRandom) {
			System.out.println("Uau, voc� � bom de chute !");
		}else {
			System.out.println("Erroou, o n�mero era "+numRandom );
		}
		
	}

}
