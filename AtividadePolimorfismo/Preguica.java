package AtividadePolimorfismo;

public class Preguica extends Animal {

	//CONSTRUTOR DA CLASSE
	
		 Preguica()
		{
			super("Preguiça"); //SUPER - PRA INDICAR QUE VEM DA SUPER CLASSE
		}
		
		//ATRIBUTO		
		
		private boolean subirEmArvore;
		
				
		//IMPLEMENTAÇÃO - TEM QUE SER IGUAL A DE ANIMAL
				@Override 
				
				public void nome(String nome)
				{
					System.out.println("\n O nome da Preguiça é  " +nome);
				}
				
				@Override 
				
				public void idade (int idade)
				{
					System.out.println("\n A idade é : "+idade);
				}
				
				@Override 
				
				public void som (String som)
				{
					System.out.println(" O som que a Preguiça faz é:  ");
				}
				
				public void escalando()
				{
					this.subirEmArvore = true;
					System.out.println("Escalando uma árvores..........");
				}
				
				// GETTERS AND SETTERS
				
				
				public boolean isSubirEmArvore() {
					return subirEmArvore;
				}

				public void setSubirEmArvore(boolean subirEmArvore) {
					this.subirEmArvore = subirEmArvore;
				}
				
				
}
