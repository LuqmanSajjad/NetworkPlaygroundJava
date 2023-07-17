/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jad
 */

import Devices.*;

public class Main {
    
    public static void main(String[] args) {
         RouterA r1 = new RouterA();
         r1.setIP("g0/1", "192.168.0.1", "255.255.255.0");
         r1.setIP("g0/2", "192.168.1.1", "255.255.255.0");
         
    }
}
