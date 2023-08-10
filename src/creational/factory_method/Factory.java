package creational.factory_method;

class Factory {
    public static Product createProduct(String type) {
        if (type.equals("ConcreteProduct1")) {
            return new ConcreteProduct1();
        } else if (type.equals("ConcreteProduct2")) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
