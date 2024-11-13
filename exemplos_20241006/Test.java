package exemplos_20241006;

public class Test {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("joao", "alexan","239193");
		Conta c1 = new Conta(23, cl1, 100.0);
		c1.deposita(100.0);
		Conta c2 = c1;
		c2.deposita(200.0);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}

}
