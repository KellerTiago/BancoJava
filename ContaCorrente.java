package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double checkEspecial;
	
	
	public String getTipo () {
		return tipo ;
	}
	
	public void  setTipo (String tipo) {
		this.tipo = tipo;
		
	}
	
	public double getCheckEspecial () {
		return checkEspecial;
	}

	public void setCheckEspecial (double checkEspecial) {
		this.checkEspecial = checkEspecial;
	}
	
	public double saldoDisponivel () {
		return super.getSaldo() + checkEspecial;
	}
	
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
		
	}
}
