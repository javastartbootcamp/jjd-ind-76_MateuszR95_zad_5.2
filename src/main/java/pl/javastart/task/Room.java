package pl.javastart.task;

public class Room {

    private int area;
    private double currentTemperature;
    private boolean isAirConditioned;
    private double minTemperature;

    public Room(int area, double currentTemperature, boolean isAirConditioned, double minTemperature) {
        this.area = area;
        this.currentTemperature = currentTemperature;
        this.isAirConditioned = isAirConditioned;
        this.minTemperature = minTemperature;
    }

    public boolean toLowerTemperature() {

        if (isAirConditioned && currentTemperature > minTemperature) {
            if (currentTemperature - minTemperature >= 1) {
                currentTemperature -= 1;
            } else  {
                currentTemperature = minTemperature;
            }
            return true;
        }
        return false;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

}


