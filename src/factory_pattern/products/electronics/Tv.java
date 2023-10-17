package factory_pattern.products.electronics;

public class Tv extends Electronics{
    @Override
    public String getName() {
        return "TV";
    }

    @Override
    public String getDescription() {
        return "This is from TV class";
    }
}
