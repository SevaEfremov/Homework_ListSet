package ru.Vshp.HitBox.Block3;

public class vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance (double interval) {
        double value = maxspeed * interval;
        System.out.println("пройдет путь, равный" + value + "км.");

    }

    public void setWheels(int i) {
    }
}
class VehicleMethodDemo {
    public static void main(String[] args) {
        vehicle car = new vehicle();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;
        vehicle bus = new vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        System.out.print("автомобиль с" + car.passengers + "пассажирами");
        car.distance(time);
        System.out.print("автобус с" + bus.passengers + "пассажирами");
        bus.distance(time);
    }
}
