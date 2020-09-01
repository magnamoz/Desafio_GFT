package desafio3_4;

public class ContaPoupanca extends Conta implements Imposto {

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}

	@Override
	public double rendimento() {
		super.saldo += saldo * 0.05;
		return saldo;
	}

	@Override
	public double calcularImposto() {
		double imposto = rendimento() * 0.10;
		return imposto;
	}
}
