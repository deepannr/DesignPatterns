package com.designpatterns.structural.decorator.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class Client {

	public static void main(String[] args) throws FileNotFoundException {
		int count;
		try {
			@SuppressWarnings("resource")
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
					"C:/dev/projects/JavaProjects/Code/DesignPatterns/src/com/designpatterns/structural/decorator/file/myTest.txt")));
			while ((count = in.read()) >= 0) {
				System.out.print((char) count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
