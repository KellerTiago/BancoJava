package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
	
		Conta conta1 = new Conta ();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente ();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente ();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Saldo a partir da SuperClass " + conta1.getSaldo());
		System.out.println("Saldo a partir da SubClass " + conta2.getSaldo());
		System.out.println("Saldo a partir da SuperClass com objeto da SubClass pelo metodo Overide " + conta3.getSaldo());
		
		
		
		
		
		
		
	}

}
