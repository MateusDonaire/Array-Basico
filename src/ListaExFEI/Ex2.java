package ListaExFEI;

public class Ex2 {
	//Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A 
	//m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
	
	public static void main(String[] args) {
		double a = (8+9+7) / 3;
		double b = (4+5+6) / 3;
		double c = a+b;
		double mTotal = c / 2;
		
		System.out.println("A m�dia de 9, 8, 7 � "+a);
		System.out.println("A m�dia de 6, 5, 4 � "+b);
		System.out.println("A soma dos dois resultados � "+c);
		System.out.println("Portanto a m�dia total � "+mTotal );
	}

}
