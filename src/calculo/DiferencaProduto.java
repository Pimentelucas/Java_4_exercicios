package calculo;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("olá, digite o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("\ndigite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("\ndigite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("\ndigite o quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("\na diferença é : "+ diferenca);

	}

}
