package AtividadePolimorfismo;

public class Cachorro extends Animal {

	
	//CONSTRUTOR DA CLASSE
	
		Cachorro( )
		{
			super("Cachorro" );
		}
		
//ATRIBUTO		
		private boolean correr;
		
//IMPLEMENTAÇÃO - TEM QUE SER IGUAL A DE ANIMAL
		@Override 
		
		public void nome(String nome)
		{
			System.out.println("\n O nome do cachorro é  " +nome);
		}
		
		@Override 
		
		public void idade (int idade)
		{
			System.out.println("\n A idade é : "+idade);
		}
		
		@Override 
		
		public void som (String som)
		{
			System.out.println(" O som do cachorro é:  ");
		}
		
		public void correndo()
		{
			this.correr= true;
			System.out.println("Correndo..........");
		}
		
		// GETTERS AND SETTERS

		public boolean isCorrer() {
			return correr;
		}
	
		
}
