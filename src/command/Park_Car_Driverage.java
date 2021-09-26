/*
 * To change ParkingLot license header, choose License Headers in Project Properties.
 * To change ParkingLot template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import parkinglot.ParkingLot;
import static parkinglot.ParkingLot.availableSlotList;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MEETANSHI
 */
public class Park_Car_Driverage {
    public static void  newCar(String regNo ,String color)
    {
        if (ParkingLot.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (ParkingLot.map1.size() == ParkingLot.MAX_SIZE) {
            System.out.println("Sorry, parking lot is full");
            System.out.println();
        } else {
            Collections.sort(availableSlotList);
            String slot = availableSlotList.get(0).toString();
            
            ParkingLot.Car car;
            car = new ParkingLot.Car(regNo, color);
            ParkingLot.map1.put(slot, car);
            ParkingLot.map2.put(regNo, slot);
            if (ParkingLot.map3.containsKey(color)) {
                ArrayList<String> regNoList = ParkingLot.map3.get(color);
                ParkingLot.map3.remove(color);
                regNoList.add(regNo);
                ParkingLot.map3.put(color, regNoList);
            } else {
                ArrayList<String> regNoList = new ArrayList<String>();
                regNoList.add(regNo);
                ParkingLot.map3.put(color, regNoList);
            }
            System.out.println("Allocated slot number: " + slot);
            System.out.println();
            availableSlotList.remove(0);
        }
    }
}
