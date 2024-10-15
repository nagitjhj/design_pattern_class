package my.design_pattern_class._01_creattional_patterns._03_abstract_factory.factory;

import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Anchor;
import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Wheel;
import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.WhiteAnchor;
import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    public WhiteShipPartsFactory() {
    }

    public Wheel createWheel() {
        return new WhiteWheel();
    }

    public Anchor createAnchor() {
        return new WhiteAnchor();
    }
}
