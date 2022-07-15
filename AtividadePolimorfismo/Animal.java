package AtividadePolimorfismo;

public abstract class Animal {
//O QUE TODOS ANIMAIS CACHORRO-CAVALO - PREGUIÇA TEM EM COMUMM
// NOME - IDADE - SOM
// O OBJETIVO DA ATIVIDADE É EM INVOCAR UM MÉTODO QUE EMITE O SOM DE CADA UM DE FORMA POLIMÓRFICA
// ABSTRACT = CLASSE ABSTRATA
// UMA CLASSE ABSTRATA PODE TER METODOS ABSTRATOS 
	
	private String nome;
	private int idade;
	private String som;
	private boolean emitir;
	

//CONSTRUTOR
	
	 Animal (String nome) 
		{
		this.nome = nome;
		}	
	
	
//METODOS ABSTRATOS
//MODELOS
	
	abstract public void nome (String nome);
	abstract public void idade (int idade);
	abstract public void som (String som);

	

	// ------------------------------------
	public void emitir()

	{
		if(this.emitir == true)
			System.out.println("\n Erro! Animal emite som... ");
		else 
			System.out.println("Emitindo som......");
	}
	
	//GETTERS ANS SETTERS

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public boolean isEmitir() {
		return emitir;
	}


	public void setEmitir(boolean emitir) {
		this.emitir = emitir;
	}
	
	
	
	
	
}
