/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packets;

/**
 *
 * @author jad
 */
public class Data {
    private String content;
    public long srcMac, destMac; 
    public long srcIp, destIp;

    public Data(long srcMac, long destMac, long srcIp, long destIp) {
        this.srcMac = srcMac;
        this.destMac = destMac;
        this.srcIp = srcIp;
        this.destIp = destIp;
    }
    
    public void setContent (String content) {
        this.content = content;
    }
}


/*
we might want to crete ipv4 class 
    ability to compare ipv4 address easily
    obtain subnets
*/