package exemplos_20241006;

public class Comparar {
	public static void main(String[] args) {
		
	Cliente cl1 = new Cliente("joao", "k"," 23123142241");
	
	Conta c1 = new Conta(31,cl1,100.0);
	
	Conta c2 = new Conta(31,cl1,100.0);
	
	if(c1 == c2) {
		System.out.println("verdade");
	}else {
		System.out.println("false");
	}
	}
	
	

}
