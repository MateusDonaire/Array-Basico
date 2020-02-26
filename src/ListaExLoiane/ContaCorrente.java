package ListaExLoiane;

public class ContaCorrente {
		String nome;
		int numeroConta;
		double saldo;
		boolean especial;
		double limiteEspecial;
		
	void sacar(double valorSaque) {
		System.out.println("Efetuado saque de R$"+valorSaque);
		System.out.println();
		if(saldo >= valorSaque) {
			
			saldo -= valorSaque;
		}else {
			System.out.println("Saldo insulficiente");
			System.out.println();
		}
	}
	
	
	
	void depositar(double valorDeposito) {
		if(saldo >= valorDeposito) {
			System.out.println("Efetuado depósito de R$"+valorDeposito);
			System.out.println();
			saldo += valorDeposito;
		}else {
			System.out.println("Saldo insulficiente");
			System.out.println();
		}
		

		
	}
		
	public static void main(String[] args) {
		ContaCorrente mateus = new ContaCorrente();
		mateus.nome = "Mateus Donaire";
		mateus.numeroConta = 1234;
		mateus.especial = false;
		mateus.saldo = 2270;
		System.out.println(mateus.nome + " o seu saldo é de R$"+mateus.saldo);

		mateus.sacar(400);
		
		System.out.println(mateus.nome + " o seu novo saldo é de R$"+mateus.saldo);

		mateus.depositar(100);
		
		System.out.println(mateus.nome + " o seu novo saldo é de R$"+mateus.saldo);
		
		
		
		

		ContaCorrente rose = new ContaCorrente();
		rose.nome = "Rose Castanho";
		rose.numeroConta = 4321;
		rose.especial = true;
		rose.limiteEspecial = 10000;
		rose.saldo = 3000;
		System.out.println(rose.nome + " o seu saldo é de R$"+rose.saldo);

		
	}

}














