package com.AP;

public class Main {

    public static void main(String[] args) {

        System.out.println("1.)");
        for (int a = 0; a <= 3; a++) {
            for (int x = 0; x <= 9; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("2.)");
        for (int a = 0; a <= 4; a++) {
            for (int x = 0; x <= a; x = x + 1) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("3.)");
        for (int a = 0; a <= 4; a++) {
            for (int x = 5-a; x >= 2; x = x - 1) {
                System.out.print(" ");
            }
            for (int y = 0; y <= a; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("4.)");
        for (int a = 0; a <= 4; a++) {
            for (int x = 6 - a; x >= 2; x = x - 1){
                System.out.print(" ");
            }
            for (int y = 0; y <= 4 * a; y = y + 2){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
