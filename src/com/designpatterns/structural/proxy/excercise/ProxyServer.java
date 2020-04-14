package com.designpatterns.structural.proxy.excercise;

import java.util.Arrays;
import java.util.List;

public class ProxyServer implements ServerInterface {
	private String siteName;
	private RealServer server;
	
	public ProxyServer(String siteName) {
		this.siteName = siteName;
	}
	
	private List<String> getRestrictedSites() {
		return Arrays.asList("jasonfedin.org", "dummysite.com", "complexfind.org");
	}

	@Override
	public void connect() throws Exception {
		System.out.println("Connecting to " + siteName);
		if (getRestrictedSites().contains(siteName)) {
			throw new Exception ("Access Denied for the site: " + siteName);
		}
		
		if (server == null) {
			server = new RealServer(siteName);
		}
		server.connect();
	}
}
