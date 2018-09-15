package com.nuclearnic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of fun are you into? \n 1: Super Fun\"");

        String x = sc.next();
        System.out.println(String.format("%s", x));



    }
}
