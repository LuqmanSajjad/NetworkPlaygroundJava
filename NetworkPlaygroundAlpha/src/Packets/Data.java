/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packets;

import IP.IPV4;

/**
 *
 * @author jad
 */
public class Data {
    private String content;
    public long srcMac, destMac; 
    public IPV4 srcIp, destIp;

    public Data(long srcMac, long destMac, String srcIp, String destIp) {
        this.srcMac = srcMac;
        this.destMac = destMac;
        this.srcIp = new IPV4(srcIp);
        this.destIp = new IPV4(destIp);
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