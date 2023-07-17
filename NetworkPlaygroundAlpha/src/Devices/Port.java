/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

import IP.IPV4;

/**
 *
 * @author jad
 */
public class Port {
    
    IPV4 ipv4;
    String id;
    Port toPort;
    private Device hostDevice;
    private boolean shutdown = true;
   
    public Port(String id) {
        this.id = id;
    }
    
    public void pass(Packets.Data data) {
        if (shutdown) {
            System.out.printf("\n%s %s is shutdown, forwarding blocked...", hostDevice.getName(), id);
            return;
        }
        toPort.receive(data);
    }
    
    /*
    to the hostDevice will know which port it came from
    */
    public void receive(Packets.Data data) {
        if (shutdown) {
            System.out.printf("\nport %s %s is shutdown, can't receive packet...", hostDevice.getName(), id);
            return;
        }
        hostDevice.receive(data, this);
    }
    
    public void shutdown() {
        /*
        shutdown makes sending packets imposible
        */
        shutdown = true;
        System.out.printf("\nport %s changed state to DOWN",id);
    }
    
    public void noshutdown() {
        /*
        if neighbour is not up, refuse keep shutdown
        */
        if (toPort.isShutdown()) {
            System.out.printf("\nport %s changed state to DOWN",id);
        } else {
            System.out.printf("\nport %s changed state to UP",id);
        }
    }
    
    public boolean isShutdown() {
        return shutdown;
    }
    
    public IPV4 requestConnectedIp() {
        return toPort.returnConnectedIp();
    }
    
    public IPV4 returnConnectedIp() {
        return ipv4;
    }
}
