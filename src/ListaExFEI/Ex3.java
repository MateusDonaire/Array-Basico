package ListaExFEI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um n�mero");
		int num = scan.nextInt();
		
		int anterior = num-1;
		int sucessor = num+1;
		
		System.out.println("O sucessor do n�mero "+num+" � o "+sucessor);
		System.out.println("O anterior do n�mero "+num+" � o "+anterior);
	}

}
