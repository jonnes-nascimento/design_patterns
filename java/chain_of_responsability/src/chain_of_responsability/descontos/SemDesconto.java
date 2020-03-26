package chain_of_responsability.descontos;

import strategy.impostos.Orcamento;

public class SemDesconto implements Descontavel {
	
	@Override
	public double calcular(Orcamento orcamento) {
		System.out.println("\tSem Desconto");
		return 0;
	}
	
	@Override
	public void setProximoDesconto(Descontavel desconto) {
		// null
	}

}
