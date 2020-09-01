package desafio1;

import java.util.Scanner;

public class MostraImpar {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		num1 = scanner.nextInt();
		System.out.println("Informe o segundo n�mero:");
		num2 = scanner.nextInt();
		scanner.close();
		
		if ((num1 <= 0) || (num1 > num2)) {
			System.out.println(
					"Aten��o! Primeiro n�mero deve ser maior que zero e segundo n�mero deve ser maior que o primeiro.");
		} else {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 != 0) {
					System.out.println(i + " ");
				}
			}
		}
	}
}
