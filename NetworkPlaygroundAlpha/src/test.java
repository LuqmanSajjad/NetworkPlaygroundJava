
import IP.IPV4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jad
 */


public class test {
    public static void main(String[] args) {
        long a = 75;
        long c = 0;
        long b = 12;
        
        String ip = "192.168.32.20";
        IPV4 converter = new IPV4(ip);
        converter.setSubnet("255.255.255.0");
        System.out.println(converter.details());
    }

}