package chain_of_responsability.descontos;

import strategy.impostos.CalculadorDeImpostos;
import strategy.impostos.Imposto;
import strategy.impostos.Item;
import strategy.impostos.Orcamento;

public class Teste {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		
		Item item1 = new Item("Placa Microcontrolador ARM Cortex M3", 57.77);
		Item item2 = new Item("Sensor de umidade", 15.3);
		Item item3 = new Item("Display OLED 5\"", 12.45);
		Item item4 = new Item("Modulo de 3 botoes", 23.9);
		Item item5 = new Item("Sensor de temperatura", 18);
		Item item6 = new Item("Modulo FPGA Altera", 471.8);
		
		orcamento.adicionarItem(item1);
		orcamento.adicionarItem(item2);
		orcamento.adicionarItem(item3);
		orcamento.adicionarItem(item4);
		orcamento.adicionarItem(item5);
		orcamento.adicionarItem(item6);
		
		orcamento.listarItens();
		
		System.out.println("Orcamento: " + orcamento.getValor() + "\n");
		
		CalculadorDeImpostos impostos = new CalculadorDeImpostos();
		
		double totalImpostos = 0;
		
		totalImpostos += impostos.calcular(orcamento, Imposto.ICMS);
		totalImpostos += impostos.calcular(orcamento, Imposto.ISS);
		totalImpostos += impostos.calcular(orcamento, Imposto.ICCC);
		
		System.out.println("Impostos totais: " + totalImpostos + "\n");
		
		// caso precise chamar direto:
		//Imposto.ICCC.calcularValor(orcamento);
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		double totalDescontos = 0;
		
		totalDescontos = descontos.calcular(orcamento);
	
		System.out.println("Descontos totais: " + totalDescontos);
		
		System.out.println("\nValor total: " + (orcamento.getValor() - totalDescontos));
	}

}
