package AbstractFactory;

public class ToyotaAutomateCar implements Car{

    @Override
    public void createCar() {
        System.out.println("Create a Toyota automate car");
    }
}
