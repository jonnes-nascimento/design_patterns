package strategy.impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	private List<Item> itens;
	
	public Orcamento() {
		valor = 0;
		itens = new ArrayList<>();
	}
	
	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
		valor += item.getValor();
	}
	
	public void listarItens() {
		if(!this.itens.isEmpty()) {
			for(Item item : itens)
				System.out.println("\t" + item.getDescricao() + " > " + item.getValor());
		} else {
			System.out.println("Lista de itens vazia!");
		}
	}
}
