package com.company;

import java.util.Scanner;

public class Piano extends Product {

    private PianoTypes pianoType;
    private int numberOfOctaves;
//    private static int countProducts = 0;

    public Piano(String productName, float productPrice) {
        super(productName, productPrice);
//        this.countProducts++;
    }

    public Piano() {
        super.setProductName();
        super.setProductPrice();
        this.setNumberOfOctaves();
        this.setPianoType();
//        this.countProducts++;
    }

    public void setPianoType() {
        System.out.print("введите тип пиано, возможные типы: ");
        for (PianoTypes v : PianoTypes.values()) {
            System.out.print("|" + v.name() + "|");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String pianoType = scanner.nextLine();
        boolean flag = false;

        for (PianoTypes value : PianoTypes.values())
            if (pianoType.equalsIgnoreCase(value.name())) {
                this.pianoType = value;
                flag = true;
            }

        if (!flag) {
            System.err.println("неверный тип!");
            setPianoType();
        }
    }


    public int getNumberOfOctaves() {
        return numberOfOctaves;
    }

    public void setNumberOfOctaves() {
        System.out.println("введите количество октав:");
        Scanner scanner = new Scanner(System.in);
        int numberOfOctaves = Integer.parseInt(scanner.nextLine());
        if ((numberOfOctaves > 2) && (numberOfOctaves < 9))
            this.numberOfOctaves = numberOfOctaves;
        else {
            System.err.println("неверное количество октав!");
            setNumberOfOctaves();
        }
    }

    public static int getCountProducts() {
        return countProducts;
    }

    @Override
    public String toString() {
        return "Piano {" +
                "piano type = " + pianoType +
                "; number of octaves = " + numberOfOctaves +
                "; product name = " + this.getProductName() + "; product price = " + getProductPrice() + "}";
    }
}