package creational.builder;

public class Main {
    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder();
        builder.setName("Product1");
        builder.setPrice(100);
        builder.addFeature("Feature1");
        builder.addFeature("Feature2");

        Product product = builder.build();
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getFeatures());
    }
}
