/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

import Packets.Data;
import java.util.HashMap;

/**
 *
 * @author jad
 */
public class SwitchA implements Device {
    
    private String hostName;
    
    /*
    when sending, map addresss to port
    */
    HashMap<Long, Port> macToPort = new HashMap<>();
    
    /*
    when receiving, map id to port. Not necessarily needed. Just for simplicity
    */
    HashMap<String, Port> connectorToPort = new HashMap<>();

    @Override
    public void receive(Data data, Port arrivalPort) {
        
        long destMac = data.destMac;
        // switch update mac address
        macToPort.put(data.srcMac, arrivalPort);
        Port exitPort = macToPort.get(destMac);
        
        if (exitPort == null) { 
            System.out.println(hostName + ": Mac address couldn't be resolved, flooding to all ports...");
            // flooding occurs here.
        } else {
            send(data, exitPort);
        }
    }
    
    /*
    mechanism for MAC learning
    */

    @Override
    /*
    @param exitIntId - is on this device
    */
    public void send(Data data, Port exitPort) {
        exitPort.pass(data);
    }

    @Override
    public String getName() {
        return hostName;
    }
    
    public static void main(String[] args) {
        System.out.println("test");
    }
    
}
