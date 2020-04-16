package com.designpatterns.behavioral.command.filesystem;

class FileSystemInvokerUtil {
	public static FileSystemReceiver getUnderlyingSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Invoking " + osName + " File System");
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
