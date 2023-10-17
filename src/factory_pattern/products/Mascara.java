package factory_pattern.products;

public class Mascara implements Product{
    @Override
    public String getName() {
        return "Mascara";
    }

    @Override
    public String getDescription() {
        return "This is from Mascara class";
    }
}
