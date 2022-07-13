package AtividadeHERANCA;

public class Cavalo extends Animal {
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

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
}
