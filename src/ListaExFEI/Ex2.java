package ListaExFEI;

public class Ex2 {
	//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A 
	//média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
	
	public static void main(String[] args) {
		double a = (8+9+7) / 3;
		double b = (4+5+6) / 3;
		double c = a+b;
		double mTotal = c / 2;
		
		System.out.println("A média de 9, 8, 7 é "+a);
		System.out.println("A média de 6, 5, 4 é "+b);
		System.out.println("A soma dos dois resultados é "+c);
		System.out.println("Portanto a média total é "+mTotal );
	}

}
