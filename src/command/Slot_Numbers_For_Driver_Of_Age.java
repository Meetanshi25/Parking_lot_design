/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class Slot_Numbers_For_Driver_Of_Age {
    public static void Slot_Number_for_Car_With_Age(String Age)
    {
        if (ParkingLot.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (ParkingLot.map3.containsKey(Age)) {
            ArrayList<String> regNoList = ParkingLot.map3.get(Age);
            ArrayList<Integer> slotList = new ArrayList<Integer>();
            System.out.println();
            for (int i=0; i < regNoList.size(); i++) {
                slotList.add(Integer.valueOf(ParkingLot.map2.get(regNoList.get(i))));
            }
            Collections.sort(slotList);
            for (int j=0; j < slotList.size(); j++) {
                if (!(j == slotList.size() - 1)) {
                    System.out.print(slotList.get(j) + ",");
                } else {
                    System.out.print(slotList.get(j));
                }
            }
            System.out.println();
        } else {
            System.out.println("Not found");
            System.out.println();
        }
    }
}
