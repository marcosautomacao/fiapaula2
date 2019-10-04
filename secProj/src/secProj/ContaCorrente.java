package secProj;

public class ContaCorrente extends ContaBancaria {

	public String getTipo() {	
		return super.getTipo() + "corrente"; 
	}
	
	public void saque(double valor) {	
		saldo -= valor + (valor * 0.01);
	}

	public void deposita(int i) {
		saldo += i;		
	}
}
