package ArrayEx;


public class ArrayMatriz {

	public static void main(String[] args) {
		double[][] notasAlunos = {{5, 6 , 4.5, 9}, {8, 6, 10, 4.5},{9, 10, 3, 8}, {10,9,10,7}};
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println();
			System.out.println("Aluno "+i+":");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[j][i]);
				
			}
		}
		double soma;
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Aluno "+i+":");
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média das notas são: "+(soma/4));
			System.out.println();
		}
		
	}

}
