/*
 * To change ParkingLot license header, choose License Headers in Project Properties.
 * To change ParkingLot template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import parkinglot.ParkingLot;

/**
 *
 * @author MEETANSHI
 */
public class Car_number_with_driver_age {
    public static void Car_number_with_driver__age(String Age)
    {
        
    
     if (ParkingLot.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (ParkingLot.map3.containsKey(Age)) {
            ArrayList<String> regNoList = ParkingLot.map3.get(Age);
            System.out.println();
            for (int i=0; i < regNoList.size(); i++) {
                if (!(i==regNoList.size() - 1)){
                    System.out.print(regNoList.get(i) + ",");
                } else {
                    System.out.print(regNoList.get(i));
                }
            }
        } else {
            System.out.println("Not found");
            System.out.println();
        }
    }
}
