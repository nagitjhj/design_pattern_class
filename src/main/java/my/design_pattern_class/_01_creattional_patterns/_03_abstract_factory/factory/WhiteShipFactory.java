package my.design_pattern_class._01_creattional_patterns._03_abstract_factory.factory;

import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Ship;
import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    public Ship createShip(String name) {
        Ship ship = new WhiteShip();
        ship.setName(name);
        ship.setWheel(this.shipPartsFactory.createWheel());
        ship.setAnchor(this.shipPartsFactory.createAnchor());
        return ship;
    }
}
