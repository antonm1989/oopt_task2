package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductContainer {
    private ArrayList<Product> productList;
    private int productIndex;

    public ProductContainer() {
        this.productList = new ArrayList<>();
        this.productIndex = 0;
    }

    public int getProductIndex() {
        return productIndex;
    }

    public Product addNewProduct() {

        Product newProduct;
        System.out.print("Ведите тип нового продукта, возможные типы продуктов: ");

        for (ProductTypes v : ProductTypes.values()) {
            System.out.print("|" + v + "|");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String productType = scanner.nextLine().toUpperCase();

//        boolean flag = false;
//
//        for (ProductTypes value : ProductTypes.values())
//            if (productType.equalsIgnoreCase(value.name())) {
//                flag = true;
//                break;
//            }
//
//        if (!flag) {
//            System.err.println("неверный тип продукта! повторите ввод!");
//            newProduct = new DefaultProduct();
//            addNewProduct();
//        } else {
            switch (productType) {
                case "GUITAR":
                    newProduct = new Guitar();
                    break;
                case "PIANO":
                    newProduct = new Piano();
                    break;
                default:
                    System.err.println("неверный тип продукта! будет создан продукт по умолчанию");
                    newProduct = new DefaultProduct();
            }
//        }
        if (newProduct != null) {
            productList.add(newProduct);
            this.productIndex++;
            System.out.println();
            System.out.println("New product added!");
        }

//        productList.add(newProduct);
//        this.productIndex++;
        return newProduct;
    }

    public int countProducts() {
        return Product.countProducts;
    }

    public Product getProductByIndex() {
        return null;
    }

    public double averageProductPrice() {
        double totalPrice=0;
        for (int i = 0; i < productList.size(); i++) {
            totalPrice+=productList.get(i).getProductPrice();
        }

        return totalPrice/productList.size();
    }

    public void sortContainer() {

    }

    public void printContainer() {
        System.out.println("This container has the following products: ");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

//    @Override
//    public String toString() {
//        String s = "";
//        for (int i = 0; i < productList.size(); i++) {
//            s += i + ": " + productList.get(i)+" ";
//        }
//        System.out.println("Product container has the following products: ");
//        return s;
//    }
}
