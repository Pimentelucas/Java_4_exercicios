package calculo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horaExtra, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("olá, digite o seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\ndigite o seu adicional nouturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\ndigite quantas horas extras você fez: ");
		horaExtra = leia.nextFloat();
		
		System.out.println("\ndigite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos;
		
		System.out.println("\no seu salário líquido é : "+ salarioLiquido);
		
		leia.close();
	}

}
