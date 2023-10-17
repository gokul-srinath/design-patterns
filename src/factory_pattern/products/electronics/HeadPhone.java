package factory_pattern.products.electronics;

public class HeadPhone extends Electronics{
    @Override
    public String getName() {
        return "HeadPhone";
    }

    @Override
    public String getDescription() {
        return "This is from HeadPhone class";
    }
}
