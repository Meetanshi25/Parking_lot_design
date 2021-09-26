/*
 * To change ParkingLot license header, choose License Headers in Project Properties.
 * To change ParkingLot template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import java.util.Collections;
import parkinglot.ParkingLot;

/**
 *
 * @author MEETANSHI
 */
public class Slot_Number_For_Car_With_Number {
    public static void Slot_Number_for_Car_With_Number(String regNo)
    {
        
    
    if (ParkingLot.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (ParkingLot.map2.containsKey(regNo)) {
            System.out.println(ParkingLot.map2.get(regNo));
        } else {
            System.out.println("Not found");
            System.out.println();
        }
    }
}
