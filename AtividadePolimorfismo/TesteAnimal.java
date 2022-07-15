package AtividadePolimorfismo;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
	
		
		Animal a = null;
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Scanner leia = new Scanner(System.in);
		
		// ---------------------------------------------------------------------------------------------
		
// TENTAR REMETER OS NUMEROS AO JOGO DO BICHO
//CACHORRO - grupo 5	- dezenas: 17-18-19-20
//CAVALO -grupo 11  - dezenas : 41, 42, 43 e 44
//PREGUIÇA - Número da sorte: 05
		
		int i=0; // i = VARIAVEL DE SELEÇÃO DE ANIMAL - CAVALO - CACHORRO - PREGUIÇA- 
		do 
		{
		System.out.println("\n Qual o numero do seu animal? \n 17 - CACHORRO | 41 - CAVALO | 05 - PREGUIÇA |\n");
		i = leia.nextInt();
		
		if (i==17) //SE i É IGUAL A 17 DÁ CACHORRO
		{
			a = cachorro;
			
			
			System.out.println("Qual nome do cachorro?");
			String nome = leia.next();
			System.out.println("Quantos anos o cachorro tem?");
			int idade = leia.nextInt();
			System.out.println("O cachorro emite som?");
			String som = leia.next();


			cachorro.setNome("Bob");
			cachorro.setIdade(8);
			cachorro.setSom("AuAuAuAu");
			cachorro.emitir();
			cachorro.correndo();
			
			System.out.println();
		
		}
		
		
		else if (i==41)
		{
			a = cavalo;

			
			System.out.println("Qual nome do cavalo?");
			String nome = leia.next();
			System.out.println("Quantos anos o cavalo tem?");
			int idade = leia.nextInt();
			System.out.println("\n Qual o som que o cavalo emite?");
			String som = leia.next();
			
			cavalo.setNome("Ebano");
			cavalo.setIdade(9);
			cavalo.setSom("Pocoto Pocoto");
			cavalo.emitir();
			cavalo.correndo();
			
			System.out.println();
			
		}
		
		else if (i==05) 
			
		{
			a = preguica;
			
			
			System.out.println("Qual nome do sua preguiça?");
		    String nome = leia.next();
			System.out.println("Quantos anos sua preguiça tem?");
			int idade = leia.nextInt();
			System.out.println("Essa é legal! Qual som sua preguiça emite?");
			String som = leia.next();
			
			System.out.println();
			
			System.out.println(preguica.getNome()); //TEM QUE BOTAR PRA CHAMAR DNV OS ATRIBUTOS MODIFICADOS
			System.out.println(preguica.getIdade());
			System.out.println(preguica.isSubirEmArvore());
			
			
			
			preguica.setNome("Eremotherium");
			preguica.setIdade(3);
			preguica.setSom ("shiiiiiiiiiiii");
			preguica.emitir();
			
			preguica.isSubirEmArvore();
		}
		
		
		else
			
			{
				System.out.println("ERROOOO 40004!");
			}
		}	
		
		
			while(i<=0 || i>=41);
			
	}

}
