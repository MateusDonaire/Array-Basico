
public class MatrizTridimencional {

	public static void main(String[] args) {
		
		int [][][] vetorTridimensional = new int [3][3][3];
		System.out.println("Inicializa andamento por matriz");
		for(int i = 0; i < vetorTridimensional.length; i++) {
			System.out.println("---------");
			for(int j = 0; j < vetorTridimensional[i].length; j++) {
				System.out.println("---------");
				for(int k = 0; k < vetorTridimensional[j].length; k++) {
					System.out.println(i + " - " + j + " - " + k);
					vetorTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		System.out.println("Finaliza e soma pares, impares e total.");
		
		int soma = 0;
		int somaImpares = 0;
		int somaPares = 0;
		for(int i = 0; i < vetorTridimensional.length; i++) {
			for(int j = 0; j < vetorTridimensional[i].length; j++) {
				for(int k = 0; k < vetorTridimensional[j].length; k++) {
					soma +=	vetorTridimensional[i][j][k];
					
					if(vetorTridimensional [i][j][k] % 2 == 0) {
						somaPares += vetorTridimensional[i][j][k];
					}else {
						somaImpares +=vetorTridimensional[i][j][k];
					}
					
				}
			}
		}
		System.out.println();
		System.out.println("A Soma total é: "+somaPares);
		System.out.println("A Soma total é: "+somaImpares);
		System.out.println("A Soma total é: "+soma);

	}

}
