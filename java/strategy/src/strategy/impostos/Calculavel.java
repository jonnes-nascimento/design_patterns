package strategy.impostos;

public interface Calculavel {

	double calcularValor(Orcamento orcamento);
	String getLabel();
}
