package abstract_factory_pattern.products.table;

public class Victorian implements TableProduct{
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public String getShape() {
        return "rectangle";
    }

    @Override
    public String getType() {
        return "Victorian";
    }
}
