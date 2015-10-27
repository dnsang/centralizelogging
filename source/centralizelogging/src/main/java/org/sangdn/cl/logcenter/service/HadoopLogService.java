package org.sangdn.cl.logcenter.service;

import org.sangdn.cl.logcenter.repository.HadoopRepository;
import org.sangdn.cl.logagent.domain.LogBufferData;

import java.io.File;

public class HadoopLogService {
 
	private HadoopRepository hadoopRepository;
	 
	private boolean isFlushToHadoop(long currentFileSizeInByte) {
		return false;
	}
	 
	private void appendToLocalLog(File file) {
	 
	}
	 
	private void checkThenFlushToHadoop(File file) {
	 
	}
	 
	public void processLog(LogBufferData logBufferData) {
	 
	}
	 
}
 
