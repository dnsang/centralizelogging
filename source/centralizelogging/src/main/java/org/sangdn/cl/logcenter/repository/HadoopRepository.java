package org.sangdn.cl.logcenter.repository;

import org.sangdn.cl.logcenter.service.HadoopLogService;

import java.io.File;

public class HadoopRepository {
 
	private HadoopLogService hadoopLogService;
	 
	public boolean flushToHadoop(File file) {
		return false;
	}
	 
}
 
