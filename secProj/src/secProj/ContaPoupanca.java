package secProj;

public class ContaPoupanca extends ContaBancaria {
	public String getTipo() {	
		return super.getTipo() + "poupan�a"; 
	}
	
	public void saque(double valor) {	
		saldo -= valor;
	}
}
