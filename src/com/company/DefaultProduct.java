package com.company;

public class DefaultProduct extends Product {

//    private static int countProducts=0;

    public DefaultProduct(String productName, float productPrice) {
        super(productName, productPrice);
//        this.countProducts++;
    }

    public DefaultProduct() {
        this.setProductName("default product");
        this.setProductPrice(0.0f);
//        this.countProducts++;
    }

    @Override
    public String toString() {
        return "DefaultProduct: " + super.toString();
    }

    public static int getCountProducts() {
        return countProducts;
    }

}
