package strategy.impostos;

public class CalculadorDeImpostos {
	
	public double calcular(Orcamento orcamento, Calculavel imposto) {
		
		double valorCalculado = imposto.calcularValor(orcamento);
		
		System.out.println("\t" + imposto.getLabel() + ": " + valorCalculado);
		
		return valorCalculado;
	}
}
