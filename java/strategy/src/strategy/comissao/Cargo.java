package strategy.comissao;

public enum Cargo implements Comissionavel {

	ATENDENTE {
		@Override
		public double calcularComissao(double valorVenda) {
			return valorVenda * 0.1;
		}
	},
	
	VENDEDOR {
		@Override
		public double calcularComissao(double valorVenda) {
			return valorVenda * 0.2;
		}
	},
	
	GERENTE {
		@Override
		public double calcularComissao(double valorVenda) {
			return valorVenda * 0.3;
		}
	};
	
	public String getLabel() {
		return this.name();
	}
}
