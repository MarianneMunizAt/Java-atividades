package AtividadeHERANCA;

public class Animal {
//O QUE "TODO" ANIMAL TEM
	//NOME-IDADE-SOM
	
	private String nome;
	private int idade;
	private boolean som;
	
//METODOS -> COMPORTAMENTOS	
	
	public void emitir()

	{
		if(this.som == true)
			System.out.println("\n Erro! Animal emite som... ");
		else 
			System.out.println("Emitindo som......");
	}

	
	
	
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

	public boolean isSom() {
		return som;
	}

	
	
	
	


	
	
}
