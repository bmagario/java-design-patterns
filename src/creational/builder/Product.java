package creational.builder;

import java.util.List;

class Product {
    private String name;
    private int price;
    private List<String> features;

    public Product(String name, int price, List<String> features) {
        this.name = name;
        this.price = price;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getFeatures() {
        return features;
    }
}

