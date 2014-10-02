
public class Locked implements TurnstileState {
	
	private TurnstileMachine mMachine;
	
	public Locked(TurnstileMachine newMachine) {
		mMachine = newMachine;
	}

	@Override
	public void pushTheBar() {
		System.out.println("Insert a coin, you idiot! ");
	}

	@Override
	public void insertCoin() {
		System.out.println("Thank you for riding our metro, fool. ");
		mMachine.setState(mMachine.getStateUnlocked());
	}

}
