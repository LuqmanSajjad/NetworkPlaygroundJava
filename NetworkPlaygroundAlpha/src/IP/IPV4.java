/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IP;

/*
we still don't have error handling for invalid ips and subnet mask

 * @author jad
 */
public class IPV4 {
    long ip;
    String octetIp;
    long subnet;
    String octetSubnet;
    long network;
    String octetNetwork;
    
    public IPV4 (String stringIpv4) {
        this.octetIp = stringIpv4;
        this.ip = toBinary(stringIpv4);
    }
    
    public IPV4 (String stringIpv4, String octetSubnet) {
        this(stringIpv4);
        setSubnet(octetSubnet);
    }
    
    public void setSubnet (String octetSubnet) {
        this.octetSubnet = octetSubnet;
        this.subnet = toBinary(octetSubnet);
        this.network = ip & subnet;
        this.octetNetwork = toOctet(network);
    }
    
    /*
    converts String octets to long
    */
    private long toBinary(String stringIpv4) {
        String binary = "";
        String[] octets = stringIpv4.split("\\.");
        for (String octet: octets) {
            //convert each to binary
            int octetVal = Integer.parseInt(octet);
            binary += String.format("%8s", Integer.toBinaryString(octetVal)).replace(' ', '0');
        }
        return Long.parseLong(binary, 2);
    }
    
    /*
    change absolute value (long) to octet Strings
    */
    public String toOctet(long ip) {
        String stringIp = String.format("%32s", Long.toBinaryString(ip));
        String output = "";
        for (int i=0; i<32; i+=8) {
            String octet = stringIp.substring(i, i+8);
            output += Long.parseLong(octet, 2) + ".";
        }
        return output.substring(0, output.length()-1);
    }
        
    /*
    converting the original long ip address to 4 octets String format
    */
    public String toString() {
        return octetIp;
    }
    
    public String details() {
        return "ip  : " + octetIp + "\n" +
               "sub : " + octetSubnet + "\n" +
               "net : " + octetNetwork;
    }
}

