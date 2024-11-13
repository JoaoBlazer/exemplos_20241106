package exemplos_20241006;

public class Conta {
	
	public Integer numero;
	
	public Cliente titular;
	
	public Double saldo, limite;
	
	public static final Double limiteMaximo = 200.0;
	
	public Conta(Integer numero, Cliente titular, Double limite) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0.0;
		this.limite = limite;
	}
	
	public Boolean sacar(Double valor) {
		if (valor > 0) {
			
			if (valor <= this.saldo) {
				this.saldo -= valor;
				return true;
			}else if (valor <= this.saldo + this.limite) {
				valor -= this.saldo;
				this.saldo = 100.0;
				this.limite -= valor;
				return true;
				
			}else return false;
			
		} else return false;
	}
	
	public Boolean deposita(Double quantidade) {
		if (quantidade > 0) {	
			if (this.limite < Conta.limiteMaximo) {
				Double diferenca = Conta.limiteMaximo - this.limite;
				if (diferenca < quantidade) {
					this.limite = Conta.limiteMaximo;
					quantidade -= diferenca;
					this.saldo += quantidade;
					return true;
				}else {
					this.limite += quantidade;
					return true;
				}
			}else {
				this.saldo += quantidade;
				return true;
			}
			
		}else return false;
	}
	
	public Boolean transferir(Double valor, Conta destino) {
		this.sacar(valor);
		destino.deposita(valor);
		return true;
		
	}

}
