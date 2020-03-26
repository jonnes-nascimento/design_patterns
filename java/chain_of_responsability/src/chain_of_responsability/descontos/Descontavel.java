package chain_of_responsability.descontos;

import strategy.impostos.Orcamento;

public interface Descontavel {
	double calcular(Orcamento orcamento);
	void setProximoDesconto(Descontavel desconto);
}
