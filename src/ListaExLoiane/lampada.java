package ListaExLoiane;

public class lampada {

	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	void mostrarStatus() {
		if(ligada) {
			System.out.println("A l�mpada est� ligada.");
		}else {
			System.out.println("A l�mpada est� desligada.");
		}
	}
	void alterarStatus() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
	public static void main(String[] args) {
		lampada lamp = new lampada();
		lamp.mostrarStatus();
		lamp.alterarStatus();
		lamp.mostrarStatus();
	}

}
