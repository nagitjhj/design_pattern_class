package my.design_pattern_class._01_creattional_patterns._03_abstract_factory.factory;

import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Anchor;
import my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product.Wheel;

public interface ShipPartsFactory {
    Wheel createWheel();

    Anchor createAnchor();
}
