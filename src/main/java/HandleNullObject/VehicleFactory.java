package HandleNullObject;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle){
        // if we get anything other than car or bike, it will behave the same
        if("Car".equals(typeOfVehicle)){
            return new Car();
        } else if("Bike".equals(typeOfVehicle)){
            return new Bike();
        }
        //return null;  //without null object design pattern.
        return new NullVehicle();   //with null object design pattern.
    }
}
