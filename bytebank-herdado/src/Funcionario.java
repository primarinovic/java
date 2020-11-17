// classe abstrata n�o pode ser instanciada
public abstract class Funcionario {
		
		private String nome;
		private String cpf;
		private double salario; 
		// protected - publico s� para os filhos
		// private - privado para todos
		
	
		// metodo sem corpo, n�o h� implementa��o, os filhos que far�o a implementa��o
		public abstract double getBonificacao( );
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		

}
