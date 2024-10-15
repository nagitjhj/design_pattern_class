package my.design_pattern_class._01_creattional_patterns._03_abstract_factory.product;

public class Ship {
    private String name;
    private String color;
    private Long price;
    private Wheel wheel;
    private Anchor anchor;

    public Ship() {
    }

    public String toString() {
        String var10000 = this.name;
        return "Ship{name='" + var10000 + "', color='" + this.color + "', price=" + this.price + ", wheel=" + String.valueOf(this.wheel) + ", anchor=" + String.valueOf(this.anchor) + "}";
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public Long getPrice() {
        return this.price;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void setPrice(final Long price) {
        this.price = price;
    }

    public void setWheel(final Wheel wheel) {
        this.wheel = wheel;
    }

    public void setAnchor(final Anchor anchor) {
        this.anchor = anchor;
    }
}
