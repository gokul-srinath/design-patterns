package factory_pattern.products;

public class Shirt implements Product{
    @Override
    public String getName() {
        return "Shirt";
    }

    @Override
    public String getDescription() {
        return "This is from Shirt class";
    }
}
