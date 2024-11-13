package exemplos_20241006;

public class TestadorDeContas {
	
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("João", "Alexandre", "90300134243");
		
		Conta c1 = new Conta(23, cl1 , 200.0);
		
		Cliente cl2 = new Cliente("Juliana", "Andrade", "131231231344");
		
		Conta c2 = new Conta(42, cl2, 200.0);
		
		c2.transferir(100.0, c1);
		System.out.println(c1.titular.nome);
		System.out.println("Saldo c1: "+ c1.saldo);
		System.out.println("Limite c1: "+c1.limite);
		
		System.out.println(c2.titular.nome);
		System.out.println("Saldo c2: "+ c2.saldo);
		System.out.println("Limite c2: "+ c2.limite);
		
				
		
	}

}
