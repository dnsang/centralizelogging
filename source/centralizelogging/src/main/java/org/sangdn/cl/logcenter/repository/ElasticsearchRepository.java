package org.sangdn.cl.logcenter.repository;

public class ElasticsearchRepository {
 

	 
	public boolean bulkIndexing(String appName, String fileData) {
		return false;
	}
	 
	private void setRefreshTime(int time) {
	 
	}
	 
	private boolean isExistIndex(String appName) {
		return false;
	}
	 
	private boolean putIndexMapping(String appName) {
		return false;
	}
	 
	public boolean deleteExpired(String appName, long time) {
		return false;
	}
	 
	public Iterable findAppLog(String appName, int errorLevel, String query) {
		return null;
	}
	 
}
 
