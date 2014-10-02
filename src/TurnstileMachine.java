
public class TurnstileMachine implements TurnstileState{
	
	private TurnstileState mState;
	
	
	private TurnstileState unlocked;
	private TurnstileState locked;
	
	
	public TurnstileMachine() {
	
		unlocked = new Unlocked(this);
		locked = new Locked(this);
		
		mState = locked;
	
	}
	
	public void setState(TurnstileState state){
		mState = state;
	}


	@Override
	public void pushTheBar() {
		mState.pushTheBar();
	}


	@Override
	public void insertCoin() {
		mState.insertCoin();
	}
	
	
	public TurnstileState getStateLocked(){
		return locked;
	}
	
	public TurnstileState getStateUnlocked(){
		return unlocked;
	}

}
