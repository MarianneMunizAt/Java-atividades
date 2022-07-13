package AtividadePOO;

public class UserCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Lucas", "26/07/1997");
	//classe---nome do objeto---novo objeto
		
		System.out.println("Cliente C1");
		c1.setIdade(24);  //mudar a idade
		c1.descrever();
		c1.estado();
				

	}

}
