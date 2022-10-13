package syl.gen;

import java.sql.Timestamp;
import java.util.List;

public class SyncTimer {

	private SyncTimer instance;

	private SyncConfigManager details;

	private int schoolID;

	private Timestamp last_Sync= null;

	private Facade facade;

	private SyncWebsite syncWebsite;

	private SyncTimerInterface syncTimerInterface;

	/**
	 *  
	 */
	private void SyncTimer() {

	}

	public List showSyncHistory() {
		return null;
	}

	public SyncConfigManager getSyncTime() {
		System.out.println("Call has been made to singleton Pattern");
		return null;
	}

}
