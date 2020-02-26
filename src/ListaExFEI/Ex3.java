package ListaExFEI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		int anterior = num-1;
		int sucessor = num+1;
		
		System.out.println("O sucessor do número "+num+" é o "+sucessor);
		System.out.println("O anterior do número "+num+" é o "+anterior);
	}

}
