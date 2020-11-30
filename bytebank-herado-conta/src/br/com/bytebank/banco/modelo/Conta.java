package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo;
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

	public abstract void deposita(double valor); /*{
		this.saldo += valor;

		/*
		 * System.out.println("Valor depositado: " + valor);
		 * System.out.println("Saldo atualizado: " + this.saldo); System.out.println();
		 
	}*/

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