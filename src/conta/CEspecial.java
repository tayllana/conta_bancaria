package conta;

public class CEspecial extends CCorrente{
	private int limite;

	public CEspecial(int numero, double saldo, int limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	public void debitar(double valor){
		if (valor <= (super.getSaldo() + this.limite)) {
			super.setSaldo(super.getSaldo() - valor);
			System.out.println("\n Operação: -"+ valor + "\n Saldo: "+super.getSaldo());
		} else {
			System.out.println("\n Saldo Insuficiente");
		}
	}

	@Override
	public String toString() {
		return "\n \n CONTA ESPECIAL \n Número: " + super.getNumero() + "\n Saldo: " + super.getSaldo() +"\n Limite: " + limite;
	}
	
}
