package AtividadeHERANCA;

public class testeAnimalCachorroCavaloPreguica {

	public static void main(String[] args) {
	

		Cachorro bob = new Cachorro();
		Cavalo ebano = new Cavalo();
		Preguica eremotherium = new Preguica();
		//Eremotherium - maior preguiça do mundo 
		
		System.out.println("Cachorro Bob");
		
		bob.setNome("bob");
		bob.setIdade(8);
		
		System.out.println(bob.getNome()); //TEM QUE BOTAR PRA CHAMAR DNV O ATRIBUTOS MODIFICADOS
		System.out.println( bob.getIdade());
		
		bob.emitir();
		bob.correndo();
	
	System.out.println();
	
		System.out.println("Cavalo Ebano ");
		ebano.setIdade(9);
		ebano.setNome("Ebano");
		
		System.out.println(ebano.getNome());
		System.out.println(ebano.getIdade());
		
		ebano.emitir();
		ebano.correndo();
		
		
		System.out.println();
		
		//Eremotherium - maior preguiça do mundo 
		System.out.println("Preguiça  Eremotherium");
		eremotherium.setIdade(3);
		eremotherium.setNome("Eremotherium");
		
		System.out.println(eremotherium.getNome()); //TEM QUE BOTAR PRA CHAMAR DNV OS ATRIBUTOS MODIFICADOS
		System.out.println(eremotherium.getIdade());
		
		eremotherium.emitir();
		eremotherium.isSubirEmArvore();
		
		
		
		
		
	}

}
