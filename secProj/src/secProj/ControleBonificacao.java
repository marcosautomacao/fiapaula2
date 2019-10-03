package secProj;

public class ControleBonificacao {
	
	int totalBonificacao = 0;
	
	void registra (Funcionario f) {
		totalBonificacao += f.getBonificacao();
	}
	

}
