package desafio3_4;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(333, "Maria", 300.0);
		System.out.println(cc);
		cc.rendimento();
		System.out.println("Saldo rendimentos: " + cc.getSaldo());
		cc.calcularImposto();
		System.out.println("Saldo impostos: " + cc.getSaldo());
		
		System.out.println("===============================================");
		
		ContaPoupanca cp = new ContaPoupanca(444, "José", 500.0);
		System.out.println(cp);
		cp.rendimento();
		System.out.println("Saldo rendimentos: " + cp.getSaldo());
		cp.calcularImposto();
		System.out.println("Saldo impostos: " + cp.getSaldo());
	}
}
