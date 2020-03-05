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
			System.out.print("Nome n�o pode ser menor que 3 (tr�s) caracteres.");
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
		}

		//Entra com segundo nome
		System.out.print("Digite seu segundo nome: ");
		sobreNome = scan.nextLine();
		
		//Solicita entrada novamente, quando segundo nome for menor que 3 caracteres
		while (sobreNome.length() < 3) {
			System.out.print("Nome n�o pode ser menor que 3 (tr�s) caracteres.");
			System.out.print("Digite seu segundo nome: ");
			sobreNome = scan.nextLine();
		}

		//Entra com idade
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		//Solicita entrada novamente, quando idade n�o est� no escopo (0 - 150)
		while (idade <= 0 || idade > 150) {
			System.out.println("Idade inv�lida");
			System.out.print("Digite uma idade v�lida: ");
			idade = scan.nextInt();
		}

		//Entra com sal�rio
		System.out.print("Digite seu sal�rio R$");
		salario = scan.nextDouble();
		
		//Solicita entrada novamente, quando sal�rio � menor ou igual a zero
		while (salario <= 0) {
			System.out.print("Sal�rio inv�lido!!\nDigite seu sal�rio novamente R$");
			salario = scan.nextDouble();
		}
		//Entra com sexo
		System.out.println("Digite seu sexo, sendo:\n'm' para Masculino\n'f' para Feminino");
		sexo = scan.next();
		
		//Solicita entrada novamente, quando sexo � diferente de f ou m
		while (!sexo.equalsIgnoreCase(masc)) {
			if (sexo.equalsIgnoreCase(femi)) {
				break;
			} else {
				System.out.println(
						"Sexo inv�lido\nDigite seu sexo novamente, sendo:\n'm' para Masculino\n'f' para Feminino");
				sexo = scan.nextLine();
				
			}
		}
		//Entra com Estado Civ�l
		System.out.println("Digite seu estado civ�l, sendo:\n's' para Solteiro\n'c' para Casado\n'v' para Viuvo\n'd' para Divorciado");
		estCivil = scan.next().charAt(0);
		
		//Solicita entrada novamente, quando Estado civil � diferente de s,c,v ou d
		while (estCivil != solt ||estCivil != casad ||estCivil != viuv ||estCivil != divor ) {
			
				System.out.println(
						"Estado civ�l inv�lido!\nDigite um estado civ�l v�lido, sendo:\n's' para Solteiro\n'c' para Casado\n'v' para Viuvo\n'd' para Divorciado");
				estCivil = scan.next().charAt(0);
			
		}
		System.out.println("Dados cadastrados com sucesso!");
		
	}
}
