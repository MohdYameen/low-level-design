package HandleNullObject;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 12;
    }

    @Override
    public int getSeatingCapacity() {
        return 2;
    }
}
