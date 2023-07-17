/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

/**
 *
 * @author jad
 */
public class Connector {
    Device connectedDevice;
    Connector pair;
    
    public Connector(Device connectedDevice, Connector pair) {
        this.connectedDevice = connectedDevice;
        this.pair = pair;
    }
    
    public void pass(Packets.Data data) {
        if (pair == null) {
            System.out.println("!! This cable is not connected to two devices");
        } else {
           
        }
    }
    
    public void receive(Packets.Data data) {
        connectedDevice.receive(data, null); // configure correct input data to classfiy which port is receiving
    }
        
}
