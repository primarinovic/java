
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(50, 3302);
		
		// inconsistência:		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(50, 3308);
		Conta conta3 = new Conta(50, 3312);
		
		System.out.println(Conta.getTotal());		

	}

}
