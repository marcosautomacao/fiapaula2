package secProj;

public class Motorista extends Funcionario {
	
	void dirige() {
		System.out.println("Motorista que dirige");
	}
	
	@Override
	void trabalha() {
		System.out.println("Motorista que trabalha");
	}
	
	Motorista() {	
		
	}
	
	public int getBonificacao() {
		return 60;
	}

}
