package abstract_factory_pattern.products.chair;

public class Victorian implements ChairProduct{
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public String getType() {
        return "Victorian";
    }

    @Override
    public boolean hasCushion() {
        return true;
    }
}
