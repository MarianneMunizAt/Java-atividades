package SegundaAtividade;

import java.util.Scanner;

public class FOR_atividade2 {

	public static void main(String[] args) {
		
		int n,par=0,impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for (n=1 ;n<=10 ;n++)
		{
			System.out.println("\n Imprima um numero ");
			n = leia.nextInt();
			
			if (n%2 == 0)
			{
				par++;
			}
			
			if(n%2 == 1) 
			{
				impar++;
			}
		}
		System.out.println("\n Imprimiram " +par+ " numeros pares");
		System.out.println("\n Imprimiram " +impar+ " numeros impares");
	}

}
