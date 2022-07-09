package PrimeiraAtividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		float n1,n2,n3,crescente;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\n Escreva o primeiro número  ");
		n1 = leia.nextInt();
		System.out.printf("\n Escreva o segundo número  ");
		n2 = leia.nextInt();
		System.out.printf("\n Escreva o terceiro número  ");
		n3 = leia.nextInt();
		
		if(n1<n2 || n2<n3) 	
		{
			System.out.printf(n1 + "\n" + n2 + "\n"+ n3);
		}
	}

}
