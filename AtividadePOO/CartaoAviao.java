package AtividadePOO;

public class CartaoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao aviaoG = new Aviao("GENERATION", "GEN1234567");
		
		System.out.println(" Aviao da Generation");
		aviaoG.setHorario(8);
		aviaoG.voo();
		aviaoG.confirmado();
	}

}
