package factory_pattern.products;
public class Electronics implements Product{

    @Override
    public String getName() {
        return "Electronics";
    }

    @Override
    public String getDescription() {
        return "This is from Electronics class";
    }
}
