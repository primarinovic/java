
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente bilbo = new Cliente();
		bilbo.nome = "Bilbo Baggins";
		bilbo.cpf = "222.222.222-22";
		bilbo.profissao = "fedozinho do apartamento";
		
		Conta contaDoBilbo = new Conta();
		contaDoBilbo.deposita(100);
		
		contaDoBilbo.titular = bilbo;
		
		System.out.println(contaDoBilbo.titular.nome);
		System.out.println(contaDoBilbo.titular);
		System.out.println(bilbo);
	}

}
