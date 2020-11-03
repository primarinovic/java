
public class TestaVariaveis {
	
	public static void main (String[] args) {
		
		System.out.println("ola novo teste");
		
		int idade = 35;
		
		System.out.println("Minha idade: " + idade + " anos.");
		
		int idadeMel = idade - 32;
		
		System.out.println("Idade da Mel: " + idadeMel + " anos.");
		
		int idadeJu = idade + 1;
		
		System.out.println("Idade do Junior: " + idadeJu + " anos.");
		
		int multiplicacaoDasIdades = idade * idadeMel * idadeJu;
		
		System.out.println("A multiplicação das idades é igual a " + multiplicacaoDasIdades);
		
		int divisaoDasIdades = idade / idadeMel;
		
		System.out.println("A divisão da minha idade pela idade da Mel é igual a " + divisaoDasIdades);
				
	}

}
