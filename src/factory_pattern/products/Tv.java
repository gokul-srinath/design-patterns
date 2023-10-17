package factory_pattern.products;

public class Tv implements Product{
    @Override
    public String getName() {
        return "TV";
    }

    @Override
    public String getDescription() {
        return "This is from TV class";
    }
}
