package dal;

import java.util.ArrayList;

import bll.BacklogItem;

public class Database {
	private static Database instance = null;

	private Database() {
		this.fillBacklogItems();
	}
	

	public static Database newInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<BacklogItem> getBacklogItems() {
		return null;
	}

	public BacklogItem getBacklogItem(int paramId) throws Exception {
		return null;
	}

	public void deleteBacklogItem(int paramId) throws Exception {
		
	}

	private void fillBacklogItems() {
		
	}
}
