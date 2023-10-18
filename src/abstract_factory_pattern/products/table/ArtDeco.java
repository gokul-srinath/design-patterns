package abstract_factory_pattern.products.table;

public class ArtDeco implements TableProduct{
    @Override
    public int getLegs() {
        return 3;
    }

    @Override
    public String getShape() {
        return "oval";
    }

    @Override
    public String getType() {
        return "ArtDeco";
    }
}
