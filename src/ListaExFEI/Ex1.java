package ListaExFEI;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("DATA DE NASCIMENTO (__/__/____)");
		System.out.print("Dia: ");
		int dia = scan.nextInt();

		System.out.print("Mês: ");
		int mes = scan.nextInt();

		System.out.print("Ano (4 digitos): ");
		int ano = scan.nextInt();

		int diferencaAno = 2020 - ano;
		int diferencaMes = 12 - mes;
		int diferencaDia = 30 - dia;

		int idade = diferencaAno;

		int diasVividos = 0;
		diasVividos = diferencaAno * 365;
		diasVividos -= (diferencaMes * 30);
		diasVividos -= (30 - diferencaDia);

		int mesesVividos = 0;
		mesesVividos = idade * 12;

		System.out.println();
		System.out.println("("+dia+"/"+mes+"/"+ano+")");
		System.out.println();

		System.out.println("Você tem ou irá fazer esse ano " + idade + " anos,");
		System.out.println("Viveu aproximadamente " + mesesVividos + " meses");
		System.out.println("e "+diasVividos + " dias.");

	}

}
