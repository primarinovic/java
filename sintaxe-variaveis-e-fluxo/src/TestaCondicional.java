
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
			System.out.println("Seja bem-vindo!");

		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar," + " pois est� acompanhado");
			} else {
				System.out.println("Voc� � menor de idade, infelizmente n�o pode entrar.");
			}
		}
	}

}
