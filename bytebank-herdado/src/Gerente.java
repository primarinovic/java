// classe filha / Gerente é um Funcionario / Gerente herda de Funcionario 
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); // super - vem da classe mãe
	}

}
