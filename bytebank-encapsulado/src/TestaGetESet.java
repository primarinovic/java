
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		conta.setAgencia(488);
		System.out.println(conta.getAgencia());	
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(paulo.getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());

	}

}
