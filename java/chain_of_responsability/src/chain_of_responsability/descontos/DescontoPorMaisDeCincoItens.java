package chain_of_responsability.descontos;

import strategy.impostos.Orcamento;

public class DescontoPorMaisDeCincoItens implements Descontavel {
	
	private Descontavel proximoDesconto;
	
	@Override
	public double calcular(Orcamento orcamento) {
		
		if(orcamento.getItens().size() > 5) {
			double desconto = orcamento.getValor() * 0.1;
			System.out.println("\t" + this.getClass().getSimpleName() + " > " + desconto);
			
			return desconto;
		} else
			return this.proximoDesconto.calcular(orcamento);
	}
	
	@Override
	public void setProximoDesconto(Descontavel desconto) {
		this.proximoDesconto = desconto;
	}

}
