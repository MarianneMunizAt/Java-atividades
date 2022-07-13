package AtividadeHERANCA;

public class Cachorro extends Animal {
// NOME-IDADE-EMITIR SOM - CORRER
	
	
	private boolean correr;
	
	//COMPORTAMENTO	
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

