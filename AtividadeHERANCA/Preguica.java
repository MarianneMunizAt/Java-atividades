package AtividadeHERANCA;

public class Preguica extends Animal {
// NOME-IDADE-EMITIR SOM - SUBIR EM ARVORE
	
	private boolean subirEmArvore;
	
	//COMPORTAMENTO
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
