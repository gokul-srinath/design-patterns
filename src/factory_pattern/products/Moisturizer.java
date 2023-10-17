package factory_pattern.products;

public class Moisturizer implements Product{
    @Override
    public String getName() {
        return "Moisturizer";
    }

    @Override
    public String getDescription() {
        return "This is from Moisturizer class";
    }
}
