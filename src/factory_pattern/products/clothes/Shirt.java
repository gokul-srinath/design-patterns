package factory_pattern.products.clothes;

public class Shirt extends Clothing{
    @Override
    public String getName() {
        return "Shirt";
    }

    @Override
    public String getDescription() {
        return "This is from Shirt class";
    }
}
