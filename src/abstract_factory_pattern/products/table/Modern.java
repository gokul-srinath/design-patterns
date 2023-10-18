package abstract_factory_pattern.products.table;

public class Modern implements TableProduct{
    @Override
    public int getLegs() {
        return 1;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String getType() {
        return "Modern";
    }
}
