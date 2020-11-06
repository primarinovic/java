public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo atualizado: " + this.saldo);
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
		
		System.out.println("Valor sacado: " + valor); 
		System.out.println("Saldo atualizado: " + this.saldo);
	}
	
	public void transfere(double valor) {
		this.saldo -= valor;
		
		System.out.println("Valor transferido: " + valor); 
		System.out.println("Saldo atualizado: " + this.saldo);
	}
	
}