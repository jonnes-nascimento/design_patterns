// subscriber
public class BalancaPesada implements Observer {
	
	@Override
	public void update(double novoPeso) {
		
		System.out.print(this.getClass().getName() + " diz: " + novoPeso + " > ");
		
		if (novoPeso >= 100) {
			System.out.println("Agora eu vi vantagem! =D");
		} else {
			System.out.println("Voce come como uma criancinha...");
		}
	}
}