/*
 * To change ParkingLot license header, choose License Headers in Project Properties.
 * To change ParkingLot template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import parkinglot.ParkingLot;
import java.util.ArrayList;

/**
 *
 * @author MEETANSHI
 */
public class leave_slot {
    
    public static void leave_Slot(String slotNo)
    {
         if (ParkingLot.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (ParkingLot.map1.size() > 0) {
            ParkingLot.Car carToLeave = ParkingLot.map1.get(slotNo);
            if (carToLeave != null) {
                ParkingLot.map1.remove(slotNo);
                ParkingLot.map2.remove(carToLeave.regNo);
                ArrayList<String> regNoList = ParkingLot.map3.get(carToLeave.color);
                if (regNoList.contains(carToLeave.regNo)) {
                    regNoList.remove(carToLeave.regNo);
                }
                // Add the Lot No. back to available slot list.
                ParkingLot.availableSlotList.add(Integer.parseInt(slotNo));
                System.out.println("Slot number " + slotNo + " is free");
                System.out.println();
            } else {
                System.out.println("Slot number " + slotNo + " is already empty");
                System.out.println();
            }
        } else {
            System.out.println("Parking lot is empty");
            System.out.println();
        }
    }
    
}
