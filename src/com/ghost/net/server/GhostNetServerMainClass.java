package com.ghost.net.server;

import com.cerrillostech.quantanet.p2p.DiscoveryThreadServer;

public class GhostNetServerMainClass {
	private static Thread UDPDiscoveryThread;
	public static void main(String args[]){
		UDPDiscoveryThread = new Thread(new DiscoveryThreadServer(8888));
		UDPDiscoveryThread.start();
	}
}
