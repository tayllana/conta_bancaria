package conta;

public class CPoupanca extends CCorrente {
	private float saldominimo;

	public CPoupanca(int numero, double saldo, float saldominimo) {
		super(numero, saldo);
		this.saldominimo = saldominimo;
	}

	public float getSaldominimo() {
		return saldominimo;
	}

	public void setSaldominimo(float saldominimo) {
		this.saldominimo = saldominimo;
	}
	public void debitar(double valor){
		if (valor <= super.getSaldo()) {
			super.setSaldo(super.getSaldo() - valor);
			if(super.getSaldo() < this.saldominimo) {
				this.saldominimo = (float) super.getSaldo();
			}
			System.out.println("\n Operação: -"+valor + "\n Saldo: "+this.getSaldo() + "\n Saldo mínimo: "+ this.saldominimo);
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

	@Override
	public String toString() {
		return "\n \n CONTA POUPANÇA \n Número: " + super.getNumero() + "\n Saldo: " + super.getSaldo()  +"\n Saldo mínimo: " + saldominimo;
	}
	
}
