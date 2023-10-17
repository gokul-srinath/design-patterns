package factory_pattern.products;
public class Clothing implements Product{
    @Override
    public String getName() {
        return "Clothing";
    }

    @Override
    public String getDescription() {
        return "this is from Clothing class";
    }
}
