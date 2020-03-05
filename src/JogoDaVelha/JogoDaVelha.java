package JogoDaVelha;

import java.util.Scanner;


public class JogoDaVelha {
	
	void tabela() {
		int posi1 = 1, posi2 = 2, posi3 = 3, posi4 = 4, posi5 = 5, posi6 = 6, posi7 =7 ,
				posi8 = 8, posi9 = 9;
		System.out.println();
		System.out.println(" "+posi1+" | "+posi2+" | "+posi3);
		System.out.println("-----------");
		System.out.println(" "+posi4+" | "+posi5+" | "+posi6);
		System.out.println("-----------");
		System.out.println(" "+posi7+" | "+posi8+" | "+posi9);
	
	
	
	}
	
	void player1(){
		int jogadaX;
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Sua vez Player 1");
		jogadaX = scan.nextInt();
		
		
	}
	void player2(){
		int jogadaO;
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Sua vez Player 2");
		jogadaO = scan.nextInt();
		
	}

	
	
	
	public static void main(String[] args) {
		JogoDaVelha jogoVelha = new JogoDaVelha();
		
		System.out.println("JOGO DA VELHA");
		jogoVelha.tabela();
		jogoVelha.player1();
		jogoVelha.player2();
	}

}
