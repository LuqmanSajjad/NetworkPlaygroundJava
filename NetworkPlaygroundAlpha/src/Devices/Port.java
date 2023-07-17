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
    long toIpAddress;
    String id;
    Port toPort;
    Device hostDevice;
   
    public Port(String id) {
        this.id = id;
    }
    
    public void pass(Packets.Data data) {
        toPort.receive(data);
    }
    
    /*
    to the hostDevice will know which port it came from
    */
    public void receive(Packets.Data data) {
        hostDevice.receive(data, this);
    }
        
}
