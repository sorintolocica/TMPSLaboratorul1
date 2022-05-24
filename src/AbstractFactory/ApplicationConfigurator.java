package AbstractFactory;

public class ApplicationConfigurator {
    public static AbstractFactory getFactory(boolean automate){
        if(automate){
            return new AutomateCarFactory();
        }else{
            return new ManualCarFactory();
        }
    }
}
