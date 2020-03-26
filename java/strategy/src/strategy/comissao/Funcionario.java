package strategy.comissao;

public class Funcionario {
	
	private Comissionavel cargo;
	
	public Funcionario() {}
	
	public Funcionario(Comissionavel cargo) {
		this.cargo = cargo;
	}

	public Comissionavel getCargo() {
		return cargo;
	}

	public void setCargo(Comissionavel cargo) {
		this.cargo = cargo;
	}
	
}
