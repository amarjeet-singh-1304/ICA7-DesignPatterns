package syl.gen;

import java.util.List;

public interface SyncTimerInterface {

	SyncTimer syncTimer = null;

	public abstract void syncTimer();

	public abstract List showSyncHistory();

	public abstract SyncConfigManager getSyncTime();

}
