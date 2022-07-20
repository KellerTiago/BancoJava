package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta () ;
		
		cc.depositar (50.0);
		cc.setAgencia (123);
		cc.setNumero (50);
		
		if ( cc.getNumero () > 0 ) {
		
			cc.depositar(1000);
		
			System.out.println("O saldo da conta é : " + cc.getSaldo ());
		
			Conta pp = new Conta (111, 222, 1000);
		
			pp.retirar(50);
		
		System.out.println("O saldo da conta é : " + pp.getSaldo());
		} 
		else { System.out.println("Insira um valor a para depositar ou retirar !"); }
		
		
	}

}
