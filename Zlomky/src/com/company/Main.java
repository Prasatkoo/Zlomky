package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zlomky");
        System.out.println("Zadej číslo:");
        int input = sc.nextInt();
        float soucet = 0;
        for (int i = 1; i <= input; i++) {
            float a = (float) 1/i;
            System.out.println("1" + "/" + i + "=>" + a);
            soucet += a;
        }
        System.out.println("Součet je: " + soucet);

    }
}
