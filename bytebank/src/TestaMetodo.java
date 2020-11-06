
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoBilbo = new Conta();
		contaDoBilbo.saldo = 100;
		
		contaDoBilbo.deposita(50);
		
		
		contaDoBilbo.saca(200);
		
		Conta contaDaCake = new Conta();
		contaDaCake.deposita(1000);
		
		contaDaCake.transfere(300, contaDoBilbo);
		
		System.out.println(contaDoBilbo.saldo);
		

	}

}
