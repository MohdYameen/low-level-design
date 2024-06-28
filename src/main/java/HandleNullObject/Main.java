package HandleNullObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Enter the type of Vehicle you need details for : ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        Vehicle vehicle = VehicleFactory.getVehicleObject(input);
        Vehicle vehicle = VehicleFactory.getVehicleObject("");
        printVehicleDetails(vehicle);
    }
    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity is "+vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity is "+vehicle.getTankCapacity());
    }
}
