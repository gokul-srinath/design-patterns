package factory_pattern.products.clothes;

public class Pant extends Clothing{
    @Override
    public String getName() {
        return "Pant";
    }

    @Override
    public String getDescription() {
        return "This is from Pant class";
    }
}
