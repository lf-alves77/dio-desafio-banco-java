
public abstract class Conta implements iConta {
	
	private static final int agenciaPadrao = 0;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	

	public Conta() {
		this.agencia = Conta.agenciaPadrao;
		this.numero = SEQUENCIAL++;
	}
	
	
	
	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	public void transferir() {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo - valor;
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo + valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	

}
