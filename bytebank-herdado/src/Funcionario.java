// classe abstrata não pode ser instanciada
public abstract class Funcionario {
		
		private String nome;
		private String cpf;
		private double salario; 
		// protected - publico só para os filhos
		// private - privado para todos
		
	
		// metodo sem corpo, não há implementação, os filhos que farão a implementação
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
