package aula_19_09;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int randomNum = (int)(Math.random() * 30);
		int numero = 0;
		
		System.out.println("O numero aleatorio é : "  + randomNum);
		System.out.print("\nTente adivinhar o numero: ");
		numero = scan.nextInt();
		
		while(numero != randomNum) {
			if (numero > randomNum) {
				System.out.print("Digite um numero menor: ");
			} else if (numero < randomNum){
				System.out.print("Digite um numero maior: ");
			}
			numero = scan.nextInt();
		}
		System.out.println("Você acertou o numero!" );
		scan.close();
		
	}

}
