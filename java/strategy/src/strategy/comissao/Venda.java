package strategy.comissao;

public class Venda {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(Cargo.GERENTE);
		double valorVenda = 1535.27;
		
		double valorComissao = funcionario.getCargo().calcularComissao(valorVenda);
		
		System.out.println("Cargo: " + funcionario.getCargo().getLabel());
		System.out.println("Valor da venda: " + valorVenda);
		System.out.println("Valor da comissao: " + valorComissao);

	}

}