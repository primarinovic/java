public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		total++;
		//System.out.println("O total de contas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando a conta n�mero: " + this.numero);
	}

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
		if (numero <= 0) {
			System.out.println("valores negativos n�o podem ser utilizados");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia () {
		return this.agencia;		
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("valores negativos n�o podem ser utilizados");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}