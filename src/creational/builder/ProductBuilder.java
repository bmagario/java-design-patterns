package creational.builder;

import java.util.ArrayList;
import java.util.List;

class ProductBuilder {
    private String name;
    private int price;
    private List<String> features = new ArrayList<>();

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder addFeature(String feature) {
        this.features.add(feature);
        return this;
    }

    public Product build() {
        return new Product(name, price, features);
    }
}
