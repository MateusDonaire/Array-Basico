package ListaExLoiane;

public class Exception {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 8, 4, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
			System.out.println(numeros[i] +" / "+ denom[i] +" = "+ (numeros[i]/denom[i]));
			} catch(ArithmeticException e){
				System.out.println("ERRO: "+e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
