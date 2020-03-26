package chain_of_responsability.descontos;

import strategy.impostos.Orcamento;

public class CalculadorDeDescontos {

	public double calcular(Orcamento orcamento) {
		
		Descontavel descontoPorMaisDeCincoItens = new DescontoPorMaisDeCincoItens();
		Descontavel descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Descontavel semDesconto = new SemDesconto();
		
		descontoPorMaisDeCincoItens.setProximoDesconto(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximoDesconto(semDesconto);
		
		return descontoPorMaisDeCincoItens.calcular(orcamento);
		
	}
}
