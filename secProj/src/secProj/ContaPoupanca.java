package secProj;

public class ContaPoupanca extends ContaBancaria {
	public String getTipo() {	
		return super.getTipo() + "poupança"; 
	}
	
	public void saque(double valor) {	
		saldo -= valor;
	}
}
