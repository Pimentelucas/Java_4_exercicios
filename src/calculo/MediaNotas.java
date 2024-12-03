package calculo;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("olá, digite a sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\ndigite a sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\ndigite a sua primeira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\ndigite a sua segunda nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\na média é : "+ media);

	}

}
