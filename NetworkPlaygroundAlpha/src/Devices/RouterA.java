/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

import IP.IPV4;
import Packets.Data;
import java.util.HashMap;

/**
 *
 * @author jad
 */
public class RouterA implements Device {

    private String hostName;
    
    /*
    Should be Routing Table , probably needs a class for itself
    */
    HashMap<Long, Port> directlyConnected = new HashMap<>();
    
    /*
    when receiving, map id to port. Not necessarily needed. Just for simplicity and speec
    */
    HashMap<String, Port> ports = new HashMap<>();
    
    public RouterA () {
        ports.put("g0/0", new Port("g0/0"));
        ports.put("g0/1", new Port("g0/1"));
        ports.put("g0/2", new Port("g0/2"));
    }
    
    @Override
    public void receive(Data data, Port srcPort) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void send(Data data, Port exitPort) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        return hostName;
    }
    
    public void setIP(String intId, String ipv4, String subnet) {
        Port port = ports.get(intId);
        port.ipv4 = new IPV4(ipv4, subnet);
    }
    
    public void shutdown(String intId, boolean shutdown) {
        if (shutdown)
            ports.get(intId).shutdown();
        else 
            ports.get(intId).noshutdown();
    }
}
