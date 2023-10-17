package factory_pattern.products;
public class Cosmetics implements Product{
    @Override
    public String getName() {
        return "Cosmetics";
    }

    @Override
    public String getDescription() {
        return "This is from Cosmetics class";
    }
}
