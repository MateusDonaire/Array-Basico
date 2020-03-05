package ListaExFEI;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiasVividos {
	static int dia;
	static int mes;
	static int ano;
	int diasVividosNoAnoNascido;
	int diasVividosAteOAnoAtual;
	int diasVividosNoAnoAtual;
	int totalVivido;
	int idade;
	int dataAniversario;

	LocalDateTime now = LocalDateTime.now();

	void calculaDiasVividosNoAnoNascido(int dia, int mes) {
		dia = 30 - dia;
		mes = (12 - mes) * 30 + 5;
		dia = mes + dia;
		diasVividosNoAnoNascido = dia;
	}

	void calculaDiasVividosAteOAnoAtual(int ano) {
		ano = now.getYear() - ano;
		idade = ano;
		ano = (ano - 1) * 365;
		diasVividosAteOAnoAtual = ano;

	}

	void calculaDiasVividosNoAnoAtual() {
		diasVividosNoAnoAtual = now.getDayOfYear();
	}

	void CalculaTotalVivido() {

		totalVivido += diasVividosNoAnoNascido;
		totalVivido += diasVividosAteOAnoAtual;
		totalVivido += diasVividosNoAnoAtual;

	}
	
	
	void VericarAniversario(int mes) {
		if (mes > now.getMonthValue()) {
			idade--;
		}
	}
	
	

	public static void main(String[] args) {
		DiasVividos diasVividos = new DiasVividos();

		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("DATA DE NASCIMENTO (__/__/____)");
		System.out.print("Dia: ");
		 dia = scan.nextInt();

		System.out.print("Mês: ");
		 mes = scan.nextInt();

		System.out.print("Ano (4 digitos): ");
		 ano = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("ERRO: Valor digitado inválido. ");
			
		}
		System.out.println("("+dia+"/"+ mes+"/"+ano+")");
		System.out.println();
		diasVividos.calculaDiasVividosNoAnoNascido(dia, mes);
		diasVividos.calculaDiasVividosAteOAnoAtual(ano);
		diasVividos.calculaDiasVividosNoAnoAtual();

		diasVividos.CalculaTotalVivido();
		System.out.println("Você viveu " + diasVividos.totalVivido + " dias até hoje.");
		diasVividos.VericarAniversario(mes);
		System.out.println("Você tem "+diasVividos.idade+" anos.");
		scan.close();

	}
}
