package my.design_pattern_class._01_creattional_patterns._03_abstract_factory.factory;

import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Ship;

public interface ShipFactory {
    default Ship startOrder(String name) {
        Ship ship = this.createShip(name);
        return ship;
    }

    Ship createShip(String name);
}
