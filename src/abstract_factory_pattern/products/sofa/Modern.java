package abstract_factory_pattern.products.sofa;

public class Modern implements SofaProduct{
    @Override
    public String getType() {
        return "Modern";
    }

    @Override
    public boolean hasLeather() {
        return false;
    }
}
