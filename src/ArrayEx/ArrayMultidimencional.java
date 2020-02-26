package ArrayEx;


import java.util.Random;

public class ArrayMultidimencional {

	public static void main(String[] args) {
		int[][] numAleatorios = new int[5][5];
		
		Random numRandom = new Random();
			for(int i = 0; i < numAleatorios.length; i++) {
				for(int j = 0; j < numAleatorios[i].length; j++) {
					numAleatorios[i][j] = numRandom.nextInt(100); 
				}
			}
			int maior = 0;
			int lin = 0;
			int col = 0;
			for(int i = 0; i < numAleatorios.length; i++) {
				for(int j = 0; j < numAleatorios[i].length; j++) {
					numAleatorios[i][j] = numRandom.nextInt(100); 
						if(numAleatorios[i][j] > maior) {
							maior = numAleatorios[i][j];
							lin = i;
							col = j;
						}
				}
				
			}

			for(int i = 0; i < numAleatorios.length; i++) {
				for(int j = 0; j < numAleatorios[i].length; j++) {
					
					System.out.print(numAleatorios[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Maior: "+maior);
			System.out.println("Linha: "+lin);
			System.out.println("Coluna: "+col);
		
	}

}
