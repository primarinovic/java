public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Excepction " + msg);
			ex.printStackTrace();
		}		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();	
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		
		//ArithmeticException exception = new ArithmeticException("Erro");
		//throw exception;
		throw new ArithmeticException("Erro");
		
		//System.out.println("Fim do metodo2");
	}

}
