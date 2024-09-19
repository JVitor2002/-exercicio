package aula_19_09;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int aux1 = 0;
		boolean validar = true;
		int numero = 0;

		do {
			System.out.print("Digite um numero inteiro: ");
			numero = scan.nextInt();

			if (numero != 0) {
				if (validar) {
					aux1 = numero;
					validar = false;
				} else if (numero < aux1) {
					aux1 = numero;
				}
			}

		} while (numero != 0);

		if (validar) {
			System.out.println("Numero invalido");
		}else {
			System.out.println("\nO menor numero digitado foi: " + aux1);
		}

		scan.close();
	}

}
