package secProj;

public abstract class ContaBancaria {
	private String titular;
	protected double saldo;
	
	public String getTipo() {
		return "Conta";
	}
	
	public abstract void saque(double valor);
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
