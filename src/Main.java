
public class Main {
	
	public static void main(String[] args) {
		Conta cc = new contaCorrente();
		Conta cp = new contaPoupanca();
		cc.depositar(100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
