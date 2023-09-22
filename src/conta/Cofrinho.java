package conta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cofrinho {
	private List<Moeda> moedas;

	public Cofrinho() {
		moedas = new ArrayList<Moeda>();
	}
	public void adicionar(Moeda moeda) {
		if(isValido(moeda.getValor())){
			moedas.add(moeda);
		}
	}
	public void moedasTotais() {
		System.out.println("\n Número total de moedas: "+ moedas.size());
		double soma = 0;
        for (Moeda moeda : moedas) {
            soma += moeda.getValor();
        }
		System.out.println("\n Valor total em moedas: "+ soma);
	}
	public void quantidadeMoeda(Moeda moeda) {
		int count = 0;
        for (Moeda m : moedas) {
            if (m.getValor() == moeda.getValor()) {
                count++;
            }
        }
        System.out.println("\n Existem "+ count + " moedas do valor "+ moeda.getValor());
	}
	public void maiorMoeda() {
		  double maiorMoeda = 0;

          for (Moeda moeda : moedas) {
              if (moeda.getValor() > maiorMoeda) {
                  maiorMoeda = moeda.getValor();
              }
          }
          System.out.println("\n Moeda de maior valor: "+ maiorMoeda);
	}
	public boolean isValido(Double valor) {
		double[] valores = {0.05, 0.10, 0.25, 0.50, 1};
		List<Double> list = Arrays.asList(Arrays.stream(valores)
	            .boxed()
	            .toArray(Double[]::new));
		return list.contains(valor);
	}
}
