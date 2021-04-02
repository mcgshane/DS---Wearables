
package jmdns;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

// This code is adapted from https://github.com/jmdns/jmdns
public class ServiceRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo smartWatch = ServiceInfo.create("_http._tcp.local.", "smartWatch", 52025, "path=index.html");
            jmdns.registerService(smartWatch);
            
            ServiceInfo smartGlasses = ServiceInfo.create("_http._tcp.local.", "smartGlasses", 50565, "path=index.html");
            jmdns.registerService(smartGlasses);
            
            ServiceInfo smartCoat = ServiceInfo.create("_http._tcp.local.", "smartWatch", 50555, "path=index.html");
            jmdns.registerService(smartCoat);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
