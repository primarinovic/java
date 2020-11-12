 
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do EDITOR DE VIDEO");
		return super.getBonificacao() + 100; 
	}

}
