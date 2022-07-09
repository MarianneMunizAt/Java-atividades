package SegundaAtividade;

import java.util.Scanner;

public class WHILE_atividade3 {

	public static void main(String[] args) {

		int idade,tmenor21=0,tmaior50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade =leia.nextInt();
	
		
		while(idade!=-99)
		{
			if (idade<21)
			{
				tmenor21++;
			}
			if (idade>50)
			{
				tmaior50++;
			}	
			System.out.println("Digite a idade e -99 pra encerrar");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de idades menores que 21" +tmenor21);
		System.out.println("\nTotal de idades menores que 21" +tmaior50);
	}
	
}
