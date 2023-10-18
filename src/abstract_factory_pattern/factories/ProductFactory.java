package abstract_factory_pattern.factories;

import abstract_factory_pattern.products.chair.ChairProduct;
import abstract_factory_pattern.products.sofa.SofaProduct;
import abstract_factory_pattern.products.table.TableProduct;

public interface ProductFactory {
    ChairProduct createChair();
    TableProduct createTable();
    SofaProduct createSofa();
}
