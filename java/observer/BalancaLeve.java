// subscriber
public class BalancaLeve implements Observer {
	
	@Override
	public void update(double novoPeso) {
		
		System.out.print(this.getClass().getName() + " diz: " + novoPeso + " > ");
		
		if (novoPeso < 100) {
			System.out.println("Relaxa... Voce anda dentro das espectativas! =)");
		} else {
			System.out.println("Cara, se controla! =O");
		}
	}
}