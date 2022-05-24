package AbstractFactory;

public class FordManualCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Create a Ford manual car");
    }
}
