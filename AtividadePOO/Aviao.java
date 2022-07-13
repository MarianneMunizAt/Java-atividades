package AtividadePOO;

public class Aviao {

//PENSANDO NA DESCRIÇÃO DE UM CARTÃO DE EMBARQUE PARA UM CLIENTE.
//DESCREVENDO LINHA AEREA- NUMERO DE IDENTIFICAÇÃO - CODIGO DE RESERVA - PORTÃO - HORARIO- SE FOI CANCELADO OU NÃO
	
	private String linhaaerea ;
	private String codigodereserva ;
	private int horario;
	private boolean voo; // "VOO" - VEM DO PENSAMENTO DE VOO ENCERRADO, ou seja, voo terminado/decolado - (CANCELADAO-EMBARQUE-DESPACHO)
	

// METODO CONSTRUTOR
	
		public Aviao (String l, String c )
	{
		this.linhaaerea = l;
		this.codigodereserva = c;
	}	

	
// COMPORTAMENTOS -> METODOS
	
	public void checkin() 
	
	{
		if (this.voo == true)
			System.out.println("\n Erro! Check-in disponivel ");
		else 
			System.out.println("\n Check-in em progresso ..... ");
	}
	
	public void voo()
	
	{
		if (this.voo == true)
			System.out.println("Erro! Check-in disponivel...... ");
		else
			this.voo = true;
	}
	
	public void cancelado()
	
	{
			this.voo = false;
	}
	public void confirmado()
	{
		System.out.println("Linha aerea: " + this.linhaaerea);
		System.out.println("Codigo de Reserva: " + this.codigodereserva);
		System.out.println("O voo esta confirmado? " + this.voo);
		System.out.println("O horario do voo e as " + this.horario + " horas" );
	}

	public String getLinhaaerea() {
		return linhaaerea;
	}

	public String getCodigodereserva() {
		return codigodereserva;
	}

	public boolean isVoo() {
		return voo;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
}
