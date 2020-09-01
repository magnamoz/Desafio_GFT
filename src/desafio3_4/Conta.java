package desafio3_4;

public abstract  class Conta {

	private int numero;
	private String titular;
	protected double saldo; 
	
	public Conta (int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public abstract  double rendimento ();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Agência: " + this.numero + " Titular: " + this.titular +  " Saldo: " + this.saldo;
	}
}
