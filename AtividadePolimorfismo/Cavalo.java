package AtividadePolimorfismo;

public class Cavalo extends Animal {

	//CONSTRUTOR DA CLASSE
	
		 Cavalo()
		{
			super("Cavalo"); //SUPER - PRA INDICAR QUE VEM DA SUPER CLASSE
		}
		
//ATRIBUTO		
				private boolean correr;
				
//IMPLEMENTAÇÃO - TEM QUE SER IGUAL A DE ANIMAL
				@Override 
				
				public void nome(String nome)
				{
					System.out.println("\n O nome do cavalo é  " +nome);
				}
				
				@Override 
				
				public void idade (int idade)
				{
					System.out.println("\n A idade é : "+idade);
				}
				
				@Override 
				
				public void som (String som)
				{
					System.out.println(" O som que  cavalo faz é:  ");
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
