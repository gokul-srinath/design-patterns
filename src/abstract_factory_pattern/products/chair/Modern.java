package abstract_factory_pattern.products.chair;

public class Modern implements ChairProduct{
    @Override
    public int getLegs() {
        return 1;
    }

    @Override
    public String getType() {
        return "Modern";
    }

    @Override
    public boolean hasCushion() {
        return false;
    }
}
