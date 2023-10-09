package pl.javastart.task;

public class Room {

    private int area;
    private double currentTemperature;
    private boolean isAirConditioned;
    private double minTemperature;

    public Room(int area, double currentTemperature, boolean isAirConditioned) {
        this.area = area;
        this.currentTemperature = currentTemperature;
        this.isAirConditioned = isAirConditioned;
    }

    public boolean toLowerTemperature() {
        if (isAirConditioned && currentTemperature > minTemperature && currentTemperature - minTemperature >= 1) {
            currentTemperature -= 1;
            return true;
        } else if (isAirConditioned && currentTemperature > minTemperature && currentTemperature - minTemperature < 1
                && currentTemperature - minTemperature > 0) {
            double difference = currentTemperature - minTemperature;
            currentTemperature = currentTemperature - difference;
            return true;
        } else  {
            return false;
        }
    }

    public double setMinTemp(double minTemp) {
        return minTemperature = minTemp;

    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

}


