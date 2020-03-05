package DadosCadastrais;

import java.util.Scanner;

public class DadosCadastrais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome;
		String sobreNome;
		int idade;
		double salario;
		String sexo;
		String femi = "f";
		String masc = "m";
		char estCivil;
		char solt = 's';
		char casad = 'c';
		char viuv = 'v';
		char divor = 'd';

		System.out.println("****************");
		System.out.println("DADOS CADASTRAIS");
		System.out.println("****************");

		//Entra com o nome
		System.out.print("Digite seu primeiro nome: ");
		nome = scan.nextLine();
		
		//Solicita entrada novamente, quando nome for menor que 3 caracteres
		while (nome.length() < 3) {
			System.out.print("Nome não pode ser menor que 3 (três) caracteres.");
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
		}

		//Entra com segundo nome
		System.out.print("Digite seu segundo nome: ");
		sobreNome = scan.nextLine();
		
		//Solicita entrada novamente, quando segundo nome for menor que 3 caracteres
		while (sobreNome.length() < 3) {
			System.out.print("Nome não pode ser menor que 3 (três) caracteres.");
			System.out.print("Digite seu segundo nome: ");
			sobreNome = scan.nextLine();
		}

		//Entra com idade
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		//Solicita entrada novamente, quando idade não está no escopo (0 - 150)
		while (idade <= 0 || idade > 150) {
			System.out.println("Idade inválida");
			System.out.print("Digite uma idade válida: ");
			idade = scan.nextInt();
		}

		//Entra com salário
		System.out.print("Digite seu salário R$");
		salario = scan.nextDouble();
		
		//Solicita entrada novamente, quando salário é menor ou igual a zero
		while (salario <= 0) {
			System.out.print("Salário inválido!!\nDigite seu salário novamente R$");
			salario = scan.nextDouble();
		}
		//Entra com sexo
		System.out.println("Digite seu sexo, sendo:\n'm' para Masculino\n'f' para Feminino");
		sexo = scan.next();
		
		//Solicita entrada novamente, quando sexo é diferente de f ou m
		while (!sexo.equalsIgnoreCase(masc)) {
			if (sexo.equalsIgnoreCase(femi)) {
				break;
			} else {
				System.out.println(
						"Sexo inválido\nDigite seu sexo novamente, sendo:\n'm' para Masculino\n'f' para Feminino");
				sexo = scan.nextLine();
				
			}
		}
		//Entra com Estado Civíl
		System.out.println("Digite seu estado civíl, sendo:\n's' para Solteiro\n'c' para Casado\n'v' para Viuvo\n'd' para Divorciado");
		estCivil = scan.next().charAt(0);
		
		//Solicita entrada novamente, quando Estado civil é diferente de s,c,v ou d
		while (estCivil != solt ||estCivil != casad ||estCivil != viuv ||estCivil != divor ) {
			
				System.out.println(
						"Estado civíl inválido!\nDigite um estado civíl válido, sendo:\n's' para Solteiro\n'c' para Casado\n'v' para Viuvo\n'd' para Divorciado");
				estCivil = scan.next().charAt(0);
			
		}
		System.out.println("Dados cadastrados com sucesso!");
		
	}
}
