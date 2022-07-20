package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta () ;
		
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 0;
		
		if ( cc.numero > 0 ) {
		
			cc.depositar(1000);
		
			System.out.println("O saldo da conta é : " + cc.verificarSaldo());
		
			Conta pp = new Conta (111, 222, 1000);
		
			pp.retirar(50);
		
		System.out.println("O saldo da conta é : " + pp.verificarSaldo());
		} 
		else { System.out.println("Insira um valor a para depositar ou retirar !"); }
		
		
	}

}
