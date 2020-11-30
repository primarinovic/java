package br.com.bytebank.banco.modelo;

/**
 * Classe-mãe das contas
 * 
 * @author Pri
 *
 */

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número
	 * @param agencia
	 * @param numero
	 */
	
	public Conta (int agencia, int numero) {
		total++;
		//System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando a conta número: " + this.numero);
	}

	public abstract void deposita(double valor); /*{
		this.saldo += valor;

		/*
		 * System.out.println("Valor depositado: " + valor);
		 * System.out.println("Saldo atualizado: " + this.saldo); System.out.println();
		 
	}*/
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.saldo += valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("valores negativos não podem ser utilizados");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia () {
		return this.agencia;		
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("valores negativos não podem ser utilizados");
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