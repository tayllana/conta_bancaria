package conta;

public class Moeda {
	
 private double valor;
 private String nome;
 
	public Moeda(double valor, String nome) {
		super();
		this.valor = valor;
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
 
 
}
