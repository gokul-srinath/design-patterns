package abstract_factory_pattern.factories;

import abstract_factory_pattern.products.chair.ChairProduct;
import abstract_factory_pattern.products.sofa.SofaProduct;
import abstract_factory_pattern.products.table.TableProduct;

public class ModernFactory implements ProductFactory{
    @Override
    public ChairProduct createChair() {
        return new abstract_factory_pattern.products.chair.Modern();
    }

    @Override
    public TableProduct createTable() {
        return new abstract_factory_pattern.products.table.Modern();
    }

    @Override
    public SofaProduct createSofa() {
        return new abstract_factory_pattern.products.sofa.Modern();
    }
}
