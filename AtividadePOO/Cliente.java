package AtividadePOO;

public class Cliente {
	
//PENSANDO EM UM QUESTIONARIO DE DESCRIÇÃO DE UM CLIENTE.
// DESCREVENDO NOME-NASCIMENTO-IDADE-PELA AÇÃO DESCREVER (COMO FEITA OU NÃO FEITA/ VERDADEIRO OU FALSO)
	
 // CARACTERISTICAS
	
	private String nome;
	private String nascimento;//DUVIDA SE COLOCA INT OU STRING
	private int idade;
	private boolean descrever;
	
	// METODO CONSTRUTOR
	
		public Cliente(String n, String nt)
		
		{
			this.nome = n;
			this.nascimento = (nt) ;
		}
	
	// COMPORTAMENTOS -> METODOS
	
	public void setIdade(int idade) {
			this.idade = idade;
		}

	public void escrever()
	{
		if(this.descrever == true)
			System.out.println("\n Erro! Cliente descrito... ");
		else 
			System.out.println("\n Descrevendo ..... ");
	}
	
	public void descrever()
		
	{
		if(this.descrever == true)
			System.out.println("Erro! Cliente já descrito...... ");
		else
			this.descrever = true;
	}
	
	public void indescritível()
	{
		this.descrever = false;
	}
	
	public void estado()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("O cliente esta descrito? " + this.descrever);
		System.out.println("A idade do cliente é de: " + this.idade + " anos" );
	}

	
	// METODOS ACESSORES -> GETS E MODIFICADORES ->SETS
	
	
	public boolean isDescrever() {
		return descrever;
	}

	public void setDescrever(boolean descrever) {
		this.descrever = descrever;
	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public int getIdade() {
		return idade;
	}
	
	
}
