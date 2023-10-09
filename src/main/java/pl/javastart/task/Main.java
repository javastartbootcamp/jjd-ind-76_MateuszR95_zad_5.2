package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(43, 22.4, true);
        room1.setMinTemp(20);

        System.out.println("Czy udało się obniżyć temperaturę w pokoju 1? " + room1.toLowerTemperature());
        System.out.println("Aktualna temperatura w pokoju 1: " + room1.getCurrentTemperature());

        System.out.println();
        System.out.println("Czy udało się obniżyć temperaturę? " + room1.toLowerTemperature());
        System.out.println("Aktualna temperatura: " + room1.getCurrentTemperature());

        System.out.println();
        System.out.println("Czy udało się obniżyć temperaturę? " + room1.toLowerTemperature());
        System.out.println("Aktualna temperatura: " + room1.getCurrentTemperature());

        System.out.println();
        System.out.println("Czy udało się obniżyć temperaturę? " + room1.toLowerTemperature());
        System.out.println("Aktualna temperatura: " + room1.getCurrentTemperature());

    }
}
