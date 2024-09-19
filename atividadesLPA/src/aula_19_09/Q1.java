package aula_19_09;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;

		do {
			System.out.print("Digite um numero posivito: ");
			int numero = scan.nextInt();

			if (numero > 0) {
				soma = numero + soma;

			} else {
				System.out.println("\nNumero invalido!");
				System.out.println("A soma dos numeros positivos é : " + soma);
				break;
			}
		} while (true);

		scan.close();
	}

}
