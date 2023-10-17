package factory_pattern.products;

public class SmartPhone implements Product{
    @Override
    public String getName() {
        return "SmartPhone";
    }

    @Override
    public String getDescription() {
        return "This is from SmartPhone class";
    }
}
