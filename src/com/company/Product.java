package com.company;

import java.util.Scanner;

public abstract class Product {
    private String productName;
    private float productPrice;
    protected static int countProducts;

    public Product(String productName, float productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
        countProducts++;
    }

    public Product() {
        this.productName = "defaultProductName";
        this.productPrice = 0.0f;
        countProducts++;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название продукта: ");
        String productName = scanner.nextLine();
        if (productName.length() > 0)
            this.productName = productName;
        else {
            System.out.println("неверное имя!");
            setProductName();
        }
    }

    public float getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите цену продукта: ");
        float productPrice = scanner.nextFloat();
        if (productPrice > 0)
            this.productPrice = productPrice;
        else {
            System.out.println("неверная цена!");
            setProductPrice();
        }
    }

    public void setProductPrice(float productPrice) {
        if(productPrice>=0)
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        if(productName.length()>0)
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product name = '" + productName + '\'' +
                ", product price = " + productPrice +
                '}';
    }
}
