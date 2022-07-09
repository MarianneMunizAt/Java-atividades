package PrimeiraAtividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int num;
		double valor;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com um número" );
		num = leia.nextInt();
				
		if (num %2 == 0)
		{
			valor = Math.sqrt(num);
		} 
		else
		{
			valor = Math.pow(num, 2);
		}
		
		System.out.printf("\n Valor %.2f", valor);
	}

}
