import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Número de pessoas entrevistadas:");
		System.out.println();
		int numPessoas = scan.nextInt();
		
		String [][] nomeFilhos = new String[numPessoas][];//Array com os nomes dos filhos baseado nos numPessoas
		
			for(int i = 0; i < nomeFilhos.length; i++) {
				System.out.println("Qual a quantidade de filhos ?");
				int qtdFilhos = scan.nextInt();
				
				nomeFilhos[i] = new String [qtdFilhos]; // Quantidade de filhos atribuido ao nomeFilhos
				
					for(int j = 0;j < nomeFilhos[i].length; j++) {
						System.out.println("Qual o nome do filho "+ (j+1)+"?");
						nomeFilhos[i][j] = scan.next();
						System.out.println();
					}
			}
			System.out.println("***************************************");
	}
		Scanner closed;
}
