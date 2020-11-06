public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo atualizado: " + this.saldo);
		System.out.println();
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
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
	
	public void transfere(double valor) {
		this.saldo -= valor;
		
		System.out.println("Valor transferido: " + valor); 
		System.out.println("Saldo atualizado: " + this.saldo);
		System.out.println();
	}
	
}