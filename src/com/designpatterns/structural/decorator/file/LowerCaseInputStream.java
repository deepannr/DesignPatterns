package com.designpatterns.structural.decorator.file;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}
	
	public int read(byte b[], int offset, int length) throws IOException {
		int result = in.read(b, offset, length);
		for (int i = 0; i < offset + result; ++i) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
