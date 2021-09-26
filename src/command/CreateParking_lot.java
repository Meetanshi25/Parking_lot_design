/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import parkinglot.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MEETANSHI
 */
public class CreateParking_lot {
   static String lotCount;

    public static void create(String h) {
   lotCount=h;
     try {
            ParkingLot.MAX_SIZE = Integer.parseInt(lotCount);
        } catch (Exception e) {
            System.out.println("Invalid lot count");
            System.out.println();
        }
        ParkingLot.availableSlotList = new ArrayList<Integer>() {};
        for (int i=1; i<= ParkingLot.MAX_SIZE; i++) {
           ParkingLot.availableSlotList.add(i);
        }
        ParkingLot.map1 = new HashMap<String, ParkingLot.Car>();
        ParkingLot.map2 = new HashMap<String, String>();
        ParkingLot.map3 = new HashMap<String, ArrayList<String>>();
        System.out.println("Created parking lot with " + lotCount + " slots");
        System.out.println();
    }

   public static void main(String[] args) {
        
    
  
}
}
        
