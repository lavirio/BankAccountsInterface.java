public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngine("1.6");
        Wheel wheel = new Wheel();
        wheel.setWheel(4);
        Body body = new Body();
        body.setBody("купе");
        GearBox gearBox = new GearBox();
        gearBox.setGears(4);

        Car car = new Car();
        car.setEngine(engine);
        car.setWheel(wheel);
        car.setBody(body);
        car.setGearBox(gearBox);

        System.out.println("Объем двигателя: " + car.getEngine().getEngine() + ", количество колес: " + car.getWheel().getWheel() + ", кузов: " + car.getBody().getBody() + ", количество передач: " + car.getGearBox().getGears());


    }
}
