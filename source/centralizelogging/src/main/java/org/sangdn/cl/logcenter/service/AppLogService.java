package org.sangdn.cl.logcenter.service;

import org.sangdn.cl.logcenter.repository.ElasticsearchRepository;
import org.sangdn.cl.logagent.domain.LogBufferData;
import java.util.List;

public class AppLogService extends HadoopLogService {
 
	private ElasticsearchRepository elasticsearchRepository;
	 
	public void processAppLog(LogBufferData logBufferData) {
	 
	}
	 
	private void processBulkIndexing(List AppLogEntities) {
	 
	}
	 
	public Iterable findAppLog(String appName, int errorLevel, String query) {
		return null;
	}
	 
}
 
