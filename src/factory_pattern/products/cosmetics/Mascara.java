package factory_pattern.products.cosmetics;

public class Mascara extends Cosmetics{
    @Override
    public String getName() {
        return "Mascara";
    }

    @Override
    public String getDescription() {
        return "This is from Mascara class";
    }
}
