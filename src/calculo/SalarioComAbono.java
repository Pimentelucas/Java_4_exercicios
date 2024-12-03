package calculo;

import java.util.Scanner;

public class SalarioComAbono {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("olá, digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nolá, digite o seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O seu novo salário é: " + novoSalario);
		
	}

}
