package factory_pattern.products;

public class HeadPhone implements Product{
    @Override
    public String getName() {
        return "HeadPhone";
    }

    @Override
    public String getDescription() {
        return "This is from HeadPhone class";
    }
}
