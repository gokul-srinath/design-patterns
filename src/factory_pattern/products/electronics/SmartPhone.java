package factory_pattern.products.electronics;

public class SmartPhone extends Electronics{
    @Override
    public String getName() {
        return "SmartPhone";
    }

    @Override
    public String getDescription() {
        return "This is from SmartPhone class";
    }
}
