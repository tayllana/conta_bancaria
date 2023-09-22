package conta;

import java.util.ArrayList;

public class Clientes {
	private String nome, cpf;
	private ArrayList<CCorrente> contas;

	public Clientes(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		contas = new ArrayList<CCorrente>();
	}

	public ArrayList<CCorrente> getContas() {
		return contas;
	}

	public void addContas(CCorrente conta) {
		contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "\n Nome: " + this.nome +"\n CPF: " + this.cpf +"\n Contas: " + contas;
	}
}
