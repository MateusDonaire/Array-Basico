package ListaExLoiane;

import java.util.Scanner;

public class Calculadora {
	Scanner scan = new Scanner (System.in);

	double soma;
	double subtracao;
	double multiplicacao;
	double divisao;
	double potencia;
	static double num1;
	static double num2;
	
void somar(double num1, double num2) {
	soma = num1 + num2;
	System.out.println("A soma entre "+num1+" e "+num2+" � "+ soma);
	}

void subtrair(double num1, double num2) {
	subtracao = num1 - num2;
	System.out.println("A subtra��o entre "+num1+" e "+num2+" � "+ subtracao);

	}

void multiplicar(double num1, double num2) {
	multiplicacao = num1 * num2;
	System.out.println("A multiplica��o entre "+num1+" e "+num2+" � "+ multiplicacao);

	}

void dividir(double num1, double num2) {
	divisao = num1 / num2;
	
	System.out.println("A divis�o entre "+num1+" e "+num2+" � "+ divisao);

	}

void input(double num1, double num2) {
	num1 = scan.nextDouble();
	num2 = scan.nextDouble();
}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		System.out.println("Escolha uma uma op��o:");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		int escolher = scan.nextInt();
		
		switch(escolher) {
		case 1 : System.out.println("Digite dois n�mero");
				calc.input(num1, num2);
				System.out.println(num1+num2);
				calc.somar(num1, num2);
	}
}
}

