public class Conta {
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;

		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo atualizado: " + this.saldo);
		System.out.println();
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo atualizado: " + this.saldo);
			System.out.println();
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			System.out.println("Seu saldo: " + this.saldo);
			System.out.println();
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			// destino.deposita(valor); <= por causa do deposita(),
			// o saldo da conta destino fica exposto
			destino.saldo += valor;
			System.out.println("Valor transferido: " + valor);
			System.out.println("Saldo atualizado: " + this.saldo);
			System.out.println();
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			System.out.println("Seu saldo: " + this.saldo);
			System.out.println();
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia () {
		return this.agencia;		
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}