package secProj;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		System.out.println(cc.getTipo());
		cc.deposita(100);
		cc.saque(10);
		System.out.println(cc.getSaldo());
	}
}
