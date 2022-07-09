package SegundaAtividade;

import java.util.Scanner;

public class DOWHILE_atividade6 {

	public static void main(String[] args) {
		
		int soma=0,media=0,n,cont=0;
		
		Scanner leia = new Scanner(System.in);
	
		do 
		{
			System.out.println("\n Digite um numero ");
			n = leia.nextInt();
			
			if(n%3 == 00 && n!= 0)
			{
				soma=soma+n;
				cont++;
			}
		} 
		
		while (n!=0);
		System.out.println("\nA media dos multiplos de 3 é " +soma/cont);
	}

}
