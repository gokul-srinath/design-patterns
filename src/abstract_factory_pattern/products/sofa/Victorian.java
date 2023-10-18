package abstract_factory_pattern.products.sofa;

public class Victorian implements SofaProduct{
    @Override
    public String getType() {
        return "Victorian";
    }

    @Override
    public boolean hasLeather() {
        return true;
    }
}
