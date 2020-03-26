package strategy.impostos;

public enum Imposto implements Calculavel {
	
	ICMS {
		@Override
		public double calcularValor(Orcamento orcamento) {
			return (orcamento.getValor() * 0.05) + 5.0;
		}
	},
	
	ISS {
		@Override
		public double calcularValor(Orcamento orcamento) {
			return orcamento.getValor() * 0.06;
		}
	},
	
	ICCC {
		@Override
		public double calcularValor(Orcamento orcamento) {
			
			if(orcamento.getValor() < 1000.0)
				return orcamento.getValor() * 0.05;
			else if(orcamento.getValor() <= 3000.0)
				return orcamento.getValor() * 0.07;
			else
				return (orcamento.getValor() * 0.08) + 30.0;
		}
	};
	
	public String getLabel() {
		return this.name();
	}
}
