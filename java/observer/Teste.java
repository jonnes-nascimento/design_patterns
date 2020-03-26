public class Teste {
    public static void main(String args[]) {
        
    	BalancaPesada balancaPesada = new BalancaPesada(); // observer (subscriber)
    	BalancaLeve balancaLeve = new BalancaLeve(); // observer (subscriber)
        
        Dieta dieta = new Dieta(); // publisher cria um topico - dieta
        
        dieta.registerObserver(balancaPesada); // publisher adiciona um observador (subscriber) ao topico dieta
        dieta.registerObserver(balancaLeve); // publisher adiciona um observador (subscriber) ao topico dieta
        
        dieta.setPeso(150); // ao se alterar o valor do topico, todos os seus observadores (subscriber) sao notificados
    }
}