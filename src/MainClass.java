
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TurnstileMachine machine = new TurnstileMachine();
		
		machine.insertCoin();
		machine.pushTheBar();
		machine.pushTheBar();
		machine.pushTheBar();
		machine.insertCoin();
		machine.pushTheBar();
		machine.insertCoin();
		machine.insertCoin();
		
	}

}
