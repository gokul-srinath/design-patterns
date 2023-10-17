package factory_pattern.products.cosmetics;

public class Moisturizer extends Cosmetics{
    @Override
    public String getName() {
        return "Moisturizer";
    }

    @Override
    public String getDescription() {
        return "This is from Moisturizer class";
    }
}
