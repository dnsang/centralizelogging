package org.sangdn.cl.logagent.utils;

import org.sangdn.cl.logagent.domain.CompressorType;

public interface ICompressor {
 
	public abstract byte[] compress(byte[] buffers);
	public abstract byte[] decompress(byte[] buffers);
	public abstract CompressorType getCompressorType();
}
 
