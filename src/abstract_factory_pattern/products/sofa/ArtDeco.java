package abstract_factory_pattern.products.sofa;

public class ArtDeco implements SofaProduct{
    @Override
    public String getType() {
        return "ArtDeco";
    }

    @Override
    public boolean hasLeather() {
        return false;
    }
}
