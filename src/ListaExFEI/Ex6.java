package ListaExFEI;

import java.util.Scanner;

public class Ex6 {
	void decrescerNum(int num) {
		for(int i = 0; i <= num; num--) {
		System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Ex6 decrescerNum = new Ex6();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int num = scan.nextInt();
		
		decrescerNum.decrescerNum(num);
		
		
	}

}
