package AbstractFactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory carFactory = ApplicationConfigurator.getFactory(false);
        Car car1 = carFactory.getCar("Ford");
        car1.createCar();
        Car car2 = carFactory.getCar("Toyota");
        car2.createCar();

        AbstractFactory carFactory1 = ApplicationConfigurator.getFactory(true);
        Car car3 = carFactory1.getCar("Toyota");
        car3.createCar();
        Car car4 = carFactory1.getCar("Ford");
        car4.createCar();
    }
}
