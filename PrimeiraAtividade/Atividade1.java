package PrimeiraAtividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int n1,n2,n3,maior;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\n Escreva o primeiro número qualquer ");
		n1 = leia.nextInt();
		System.out.printf("\n Escreva o segundo número qualquer ");
		n2 = leia.nextInt();
		System.out.printf("\n Escreva o terceiro número qualquer ");
		n3 = leia.nextInt();
		
		if(n1>=n2 && n1>=n3)
		
		{
			System.out.printf("\n O número um é o maior", n1);
		}
		
		else if (n2>=n1 && n2>=n3)
			
		{
			System.out.printf("\n O número dois é o maior",n2);
		}
		
		else 
			
		{
			System.out.printf("\n O número três é o maior", n3);
		}
	}

}
