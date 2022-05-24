package AbstractFactory;

public class ToyotaManualCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Create a Toyota manual car");
    }
}
