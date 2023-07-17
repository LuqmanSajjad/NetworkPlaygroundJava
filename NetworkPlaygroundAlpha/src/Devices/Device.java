/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;
import Packets.Data;
/**
 *
 * @author jad
 */
public interface Device <T> {
    
    public void receive(Data data, Port arrivalPort);
    
    public void send(Data data, Port exitPort);
    
    public String getName();
}
