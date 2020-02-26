package ListaExFEI;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DiasVividos {
	int dia;
	int mes;
	int ano;
	int diasVividosNoAnoNascido;
	int diasVividosAteOAnoAtual;
	int diasVividosNoAnoAtual;
	int totalVivido;
	
	LocalDateTime now = LocalDateTime.now();

	void calculaDiasVividosNoAnoNascido(int dia, int mes) {
		dia = 30 - dia;
		mes = (12 - mes)*30;
		dia = mes + dia;
		diasVividosNoAnoNascido = dia;
	}
	void calculaDiasVividosAteOAnoAtual(int ano) {
		ano = now.getYear() - ano;
		ano = (ano - 2)*365;
		diasVividosAteOAnoAtual = ano;
		
	}
	
	void calculaDiasVividosNoAnoAtual(){
		diasVividosNoAnoAtual = now.getDayOfYear();
	}
	
	void totalVivido() {
		
		totalVivido += diasVividosNoAnoNascido ;
		totalVivido += diasVividosAteOAnoAtual;
		totalVivido += diasVividosNoAnoAtual;
		System.out.println(totalVivido);
	
	}
	
	public static void main(String[] args) {
		DiasVividos diasVividos = new DiasVividos();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("DATA DE NASCIMENTO (__/__/____)");
		System.out.print("Dia: ");
		int dia = scan.nextInt();

		System.out.print("Mês: ");
		int mes = scan.nextInt();

		System.out.print("Ano (4 digitos): ");
		int ano = scan.nextInt();
		
		diasVividos.calculaDiasVividosNoAnoNascido(dia, mes);
		diasVividos.calculaDiasVividosAteOAnoAtual(ano);
		diasVividos.calculaDiasVividosNoAnoAtual();
		
		
		diasVividos.totalVivido();
		
		scan.close();
		
	}
}


