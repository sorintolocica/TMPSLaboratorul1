package AbstractFactory;

public class FordAutomateCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Create a Ford automate Car");
    }
}
