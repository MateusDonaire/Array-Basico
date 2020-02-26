package ListaExLoiane;

public class Calculadora {
	double soma;
	double subtracao;
	double multiplicacao;
	double divisao;
	double potencia;
	
void somar(double num1, int num2) {
	soma = num1 + num2;
	System.out.println("A soma entre "+num1+" e "+num2+" é "+ soma);
	}

void subtrair(double num1, int num2) {
	subtracao = num1 - num2;
	System.out.println("A subtração entre "+num1+" e "+num2+" é "+ subtracao);

	}

void multiplicar(double num1, int num2) {
	multiplicacao = num1 * num2;
	System.out.println("A multiplicação entre "+num1+" e "+num2+" é "+ multiplicacao);

	}

void dividir(double num1, int num2) {
	divisao = num1 / num2;
	System.out.println("A divisão entre "+num1+" e "+num2+" é "+ divisao);

	}




	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.somar(231, 34);
		calc.subtrair(23, 54);
		calc.multiplicar(23, 2);
		calc.dividir(34, 11);
	}
}


