package conta;

public class CCorrente {
	private int numero;
	private double saldo;
	
	public CCorrente(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	public void creditar(double valor){
		this.saldo += valor;
		System.out.println("\n Operação: + "+valor + "\n Saldo: "+this.saldo);
	}

	public void debitar(double valor){
		if (valor <= this.saldo) {
			this.saldo-= valor;
			System.out.println("\n Operação: - "+valor + "\n Saldo: "+this.saldo);
		} else {
			System.out.println("\n Saldo Insuficiente");
		}
	}
	@Override
	public String toString() {
		return "\n CONTA CORRENTE \n Número: " + numero + "\n Saldo: " + saldo;
	}
	
}
