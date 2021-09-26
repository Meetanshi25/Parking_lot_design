package parkinglot;

import command.Car_number_with_driver_age;
import command.CreateParking_lot;
import command.Park_Car_Driverage;
import command.Slot_Number_For_Car_With_Number;
import command.Slot_Numbers_For_Driver_Of_Age;
import command.leave_slot;
import java.util.*;

/**
 * Created by Meetanshi on 25/09/21.
 */
public class ParkingLot {
  public static  int MAX_SIZE = 0;
    public static class Car {
        public static String regNo;
       public static  String color;
        public Car(String regNo, String color) {
            this.regNo = regNo;
            this.color = color;
        }
    }
    // Available slots list
   public static ArrayList<Integer> availableSlotList;
    // Map of Slot, Car
  public static Map<String, Car> map1;
    // Map of RegNo, Slot
   public static Map<String, String> map2;
    // Map of Color, List of RegNo
  public static Map<String, ArrayList<String>> map3;


    public void createParkingLot(String lotCount) {
       CreateParking_lot.create(lotCount);  
    }
    
    
    public void park(String regNo, String color) {
         String[] inputs =color.split(" ",3);
         if (inputs.length>2)
         {
             System.out.println("invalid input");
         }
         else
         {
             
         
//        System.out.println(inputs[1]);
        Park_Car_Driverage.newCar(regNo, inputs[1]);
    }
    }
    
    
    public void leave(String slotNo) {
       leave_slot.leave_Slot(slotNo);
    }
    
    public void getRegistrationNumbersFromAge(String Age) {
       Car_number_with_driver_age.Car_number_with_driver__age(Age);
    }
    
    
    
    
    
//    public void status() {
//        if (this.MAX_SIZE == 0) {
//            System.out.println("Sorry, parking lot is not created");
//            System.out.println();
//        } else if (this.map1.size() > 0) {
//            // Print the current status.
//            System.out.println("Slot No.\tRegistration No.\tColor");
//            Car car;
//            for (int i = 1; i <= this.MAX_SIZE; i++) {
//                String key = Integer.toString(i);
//                if (this.map1.containsKey(key)) {
//                    car = this.map1.get(key);
//                    System.out.println(i + "\t" + car.regNo + "\t" + car.color);
//                }
//            }
//            System.out.println();
//        } else {
//            System.out.println("Parking lot is empty");
//            System.out.println();
//        }
//    }
    
    public void getSlotNumbersFromAge(String Age) {
        Slot_Numbers_For_Driver_Of_Age.Slot_Number_for_Car_With_Age(Age);
    }
    
    public void getSlotNumberFromRegNo(String regNo) {
        Slot_Number_For_Car_With_Number.Slot_Number_for_Car_With_Number(regNo);
    }
}
