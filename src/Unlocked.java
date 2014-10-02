
public class Unlocked implements TurnstileState {
	
	private TurnstileMachine mMachine;
	
	public Unlocked(TurnstileMachine newMachine) {
		mMachine = newMachine;
	}

	@Override
	public void pushTheBar() {
		System.out.println("Pass quickly, you stupid");
		mMachine.setState(mMachine.getStateLocked());
	}

	@Override
	public void insertCoin() {
		System.out.println("You've already inserted one coin, how much do you want to pay, stupid?");
	}

}
