package com.company;


public class Main {

    public static void main(String[] args) {

        ProductContainer container = new ProductContainer();
//        container.printContainer();
//        System.out.println("number of existing products: " + container.countProducts());
        try {
            Product product1 = container.addNewProduct();
            System.out.println(product1.toString());
            System.out.println();
            Product product2 = container.addNewProduct();
            System.out.println(product2.toString());
        } catch (NullPointerException e) {
            System.err.println("null pointer exception");
        }
        System.out.println();
        System.out.println("Number of existing products in container: " + container.countProducts());
        container.printContainer();
        System.out.println("Average product price for this container is: " + container.averageProductPrice());
//        System.out.println(container);
    }
}