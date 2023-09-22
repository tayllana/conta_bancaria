package conta;

public class Main {

	public static void main(String[] args) {
		//CLIENTES
		Clientes c1 = new Clientes("Camila", "23433378921");
		CCorrente cc1 = new CCorrente(5000, 4500);
		CEspecial ce1 = new CEspecial(5001, 1500, 500);
		c1.addContas(cc1);
		c1.addContas(ce1);
		
		Clientes c2 = new Clientes("Vander", "23433378921");
		CPoupanca cp2 = new CPoupanca(5002, 1000, 700);
		CInvestimento ci2 = new CInvestimento(5003, 100, 20, 5);
		c2.addContas(cp2);
		c2.addContas(ci2);
		
		Clientes c3 = new Clientes("Leticia", "23433378921");
		CCorrente cc3 = new CCorrente(5000, 4500);
		CEspecial ce3 = new CEspecial(5001, 1500, 500);
		CInvestimento ci3 = new CInvestimento(5003, 100, 20, 5);
		c3.addContas(cc3);
		c3.addContas(ce3);
		c3.addContas(ci3);
		
		Clientes c4 = new Clientes("Amanda", "23433378921");
		CCorrente cc4 = new CCorrente(5000, 4500);
		CEspecial ce4 = new CEspecial(5001, 1500, 500);
		CPoupanca cp4 = new CPoupanca(5002, 1000, 700);
		CInvestimento ci4 = new CInvestimento(5003, 100, 20, 5);
		c4.addContas(cc4);
		c4.addContas(ce4);
		c4.addContas(cp4);
		c4.addContas(ci4);
		
//		CCorrente cc = new CCorrente(5000, 4500);
//		CEspecial ce = new CEspecial(5001, 1500, 500);
//		CPoupanca cp = new CPoupanca(5002, 1000, 700);
//		CInvestimento ci = new CInvestimento(5003, 100, 20, 5);
		

		System.out.println(c1);
		System.out.println("-----------------------------------------------------");
		System.out.println(c2);
		System.out.println("-----------------------------------------------------");
		System.out.println(c3);
		System.out.println("-----------------------------------------------------");
		System.out.println(c4);
		System.out.println("-----------------------------------------------------");
		
//		System.out.println(cc);
//		cc.debitar(300);
//		cc.creditar(50);
//		System.out.println("-----------------------------------------------------");
//		System.out.println(ce);
//		ce.debitar(1600);
//		ce.creditar(50);
//		System.out.println("-----------------------------------------------------");
//		System.out.println(cp);
//		cp.debitar(530);
//		cp.creditar(50);
//		System.out.println("-----------------------------------------------------");
//		System.out.println(ci);
//		ci.atualizar_saldo();
//		ci.creditar(50);
	}

}
