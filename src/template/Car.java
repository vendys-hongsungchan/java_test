package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void startCar() {
        System.out.println("시동 킴");
    }
    public void turnOff() {
        System.out.println("시동 끔");
    }

    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
