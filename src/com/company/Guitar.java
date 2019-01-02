package com.company;

import java.util.Scanner;

public class Guitar extends Product {
    private GuitarTypes guitarType;
    private int numberOfStrings;
//    private static int countProducts = 0;

    public Guitar(String productName, float productPrice) {
        super(productName, productPrice);
//        this.countProducts++;
    }

    public Guitar() {
        super.setProductName();
        super.setProductPrice();
        this.setNumberOfStrings();
        this.setGuitarType();
//        this.countProducts++;
    }

    public static int getCountProducts() {
        return countProducts;
    }

    public void setGuitarType() {
        System.out.print("введите тип гитары, возможные типы гитар: ");
        for (GuitarTypes v : GuitarTypes.values()) {
            System.out.print("|" + v.name() + "|");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String guitarType = scanner.nextLine();
        boolean flag = false;

        for (GuitarTypes value : GuitarTypes.values())
            if (guitarType.equalsIgnoreCase(value.name())) {
                this.guitarType = value;
                flag = true;
                break;
            }

        if (!flag) {
            System.err.println("неверный тип гитары!");
            setGuitarType();
        }
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings() {
        System.out.println("введите количество струн гитары:");
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        if ((numberOfStrings >= 6) && (numberOfStrings < 13))
            this.numberOfStrings = numberOfStrings;
        else {
            System.err.println("неверное количество струн!");
            setNumberOfStrings();
        }
    }

    @Override
    public String toString() {
        return "Guitar {" +
                "guitar type = " + guitarType +
                "; number of strings = " + numberOfStrings +
                "; product name = " + this.getProductName() + "; product price =  " + getProductPrice() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        if (getProductPrice() != guitar.getProductPrice()) return false;
        else return true;
        //        return guitarType == guitar.guitarType;
    }

    @Override
    public int hashCode() {
        int result = guitarType != null ? guitarType.hashCode() : 0;
        result = 31 * result + numberOfStrings;
        return result;
    }
}
