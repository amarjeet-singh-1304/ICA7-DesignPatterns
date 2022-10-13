package syl.gen;

public class Professor {

	private ModuleBuilder moduleBuilder;

	private Builder builder;

	/**
	 *  
	 */
	public void createCourse1module() {
		System.out.println("Call has been made to Decorator Pattern");
		SyncTimer syncTimer = new SyncTimer();
		syncTimer.getSyncTime();
	}

	/**
	 *  
	 */
	public void createCourse2module() {

	}

}
