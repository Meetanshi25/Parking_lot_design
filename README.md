# Parking_lot_design

PROBLEM STATEMENT

We own a parking lot that can hold up to ‘n’ cars at any given point in time. Each slot is given a number starting at one increasing with increasing distance from the entry point in steps of one. We want to create an automated ticketing system that allows our customers to use our parking lot without human intervention.
When a car enters the parking lot, we want to have a ticket issued to the driver. The ticket issuing process includes:- 
We are taking note of the number written on the vehicle registration plate and the age of the driver of the car.
And we are allocating an available parking slot to the car before actually handing over a ticket to the driver (we assume that our customers are kind enough to always park in the slots allocated to them).
The customer should be allocated a parking slot that is nearest to the entry. At the exit, the customer returns the ticket, marking the slot they were using as being available.
Due to government regulation, the system should provide us with the ability to find out:-
Vehicle Registration numbers for all cars which are parked by the driver of a certain age,
Slot number in which a car with a given vehicle registration plate is parked. 
Slot numbers of all slots where cars of drivers of a particular age are parked.

TO RUN THIS CODE PLEASE USE THIS LINK: https://replit.com/@MeetanshiGupta/PARKINGLOTDESIGN#./Main.java
Use below sample input for referrence.
SAMPLE INPUT/OUTPUT


INPUT: Create_parking_lot 6
OUTPUT: Created parking lot with 6 slots



INPUT: Park KA-01-HH-1234 driver_age 21
OUTPUT: Allocated slot number: 1




INPUT: Park PB-01-HH-1234 driver_age 21
OUTPUT: Allocated slot number: 2




INPUT: Slot_numbers_for_driver_of_age 21
OUTPUT: 1,2




INPUT: Park PB-01-TG-2341 driver_age 40
OUTPUT: Allocated slot number: 3



INPUT: Slot_number_for_car_with_number PB-01-HH-1234
OUTPUT: 2




INPUT: Leave 2
OUTPUT: Slot number 2 is free



INPUT: Park HR-29-TG-3098 driver_age 39
OUTPUT: Allocated slot number: 2



INPUT: Vehicle_registration_number_for_driver_of_age 18
OUTPUT: Not found




INPUT: Vehicle_registration_number_for_driver_of_age 39
OUTPUT: HR-29-TG-3098



INPUT: Vehicle_registration_number_for_driver_of_age 21
OUTPUT: KA-01-HH-1234,PB-01-HH-1234



INPUT: Park AZ-01-UH-6734 driver_age 25
OUTPUT: Allocated slot number: 4



INPUT: Park KA-61-YG-6424 driver_age 36
OUTPUT: Allocated slot number: 5



INPUT: Park RD-56-BT-9548 driver_age 47
OUTPUT: Allocated slot number: 6



INPUT: Park QS-56-VR-7634 driver_age 65
OUTPUT: Sorry, parking lot is full
