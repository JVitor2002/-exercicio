package aula05;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		Brinquedo brinquedo1 = new Brinquedo();
		Visitante visitante1 = new Visitante();
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		visitante1.setNome(scan.nextLine());
		System.out.print("Digite a sua altura: ");
		visitante1.setAltura(scan.nextDouble());
		System.out.print("Digite a sua idade: ");
		visitante1.setIdade(scan.nextInt());
		System.out.println();

		visitante1.exibirInfo();
		scan.nextLine();

		
		System.out.print("\nDigite o nome do brinquedo: ");
		brinquedo1.setNome(scan.nextLine());
		System.out.print("Digite a altura minima para entrar nesse brinquedo:");
		brinquedo1.setAlturaMinima(scan.nextDouble());
		System.out.print("Digite a capacidade maxima para esse brinquedo: ");
		brinquedo1.setCapacidadeMaxima(scan.nextInt());

		if (visitante1.andarNoBrinquedo()) {
			System.out.println("Você pode andar neste brinquedo\n");

		} else {
			System.out.println("Você não pode andar neste brinquedo\n");
		}
		
		
		Visitante visitante2 = new Visitante("Julia", 1.45, 14);
		Brinquedo brinquedo2 = new Brinquedo("Roda gigante", 1.50, 22);
		
		visitante2.exibirInfo();
		brinquedo2.exibirInfo();
		
		if (visitante2.andarNoBrinquedo()) {
			System.out.println("Esse visitante pode andar neste brinquedo\n");

		} else {
			System.out.println("Esse visitante não pode andar neste brinquedo\n");
		}
		

		scan.close();
	}

}
