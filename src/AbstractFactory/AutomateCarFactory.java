package AbstractFactory;

public class AutomateCarFactory extends AbstractFactory{
    @Override
    public Car getCar(String carType) {
        if(carType.equalsIgnoreCase("Ford")){
            return new FordAutomateCar();
        }else if(carType.equalsIgnoreCase("Toyota")){
            return new ToyotaAutomateCar();
        }
        return null;
    }
}
