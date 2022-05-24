package AbstractFactory;

public class ManualCarFactory extends AbstractFactory{
    @Override
    public Car getCar(String carType) {
        if(carType.equalsIgnoreCase("Toyota")){
            return new ToyotaManualCar();
        }else if(carType.equalsIgnoreCase("Ford")){
            return new FordManualCar();
        }
        return null;
    }
}

