package abstract_factory_pattern.products.chair;

public class ArtDeco implements ChairProduct{
    @Override
    public int getLegs() {
        return 3;
    }

    @Override
    public String getType() {
        return "ArtDeco";
    }

    @Override
    public boolean hasCushion() {
        return false;
    }
}
