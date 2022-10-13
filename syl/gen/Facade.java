package syl.gen;

public interface Facade {

	Builder builder = null;

	SyncTimer syncTimer = null;

	Create create = null;

	Prof prof = null;

	public void Builder();

	public abstract void Prof();

	public abstract void Create();

	public abstract void SyncTimerInterface();

}
