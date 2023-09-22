package conta;

import java.util.Calendar;

public class CInvestimento extends CCorrente {
	private int dia_investimento, periodo;

	public CInvestimento(int numero, double saldo, int dia_investimento, int periodo) {
		super(numero, saldo);
		this.dia_investimento = dia_investimento;
		this.periodo = periodo;
	}

	public int getDia_investimento() {
		return dia_investimento;
	}

	public void setDia_investimento(int dia_investimento) {
		this.dia_investimento = dia_investimento;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public void atualizar_saldo(){
		 Calendar dataAtual = Calendar.getInstance();
		 int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
		 if (dia == (this.dia_investimento+periodo)){
			 // Se investiu no dia 2  por 3 dias então entra aqui se o dia de hoje for igual a 5
			 super.setSaldo((float)(super.getSaldo() * 1.20));
			 System.out.println("\n Dia do investimento: "+dia + "\n Saldo: "+super.getSaldo());
		 }
		 else {
			 System.out.println("\n Ainda não é o dia do investimento");
		 }
	}

	@Override
	public String toString() {
		return " \n \n CONTA INVESTIMENTO \n Número: " + super.getNumero() + "\n Saldo: " + super.getSaldo() +"\n Dia do investimento: " + dia_investimento + "\n Período: "+ periodo;
	}
}
