package factory_pattern.products;

public class Pant implements Product{
    @Override
    public String getName() {
        return "Pant";
    }

    @Override
    public String getDescription() {
        return "This is from Pant class";
    }
}
