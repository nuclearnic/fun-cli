package com.nuclearnic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "What type of fun are you into? \n" +
                "1. Chuck Norris\n" +
                "2. Something Else");

        int choice = sc.nextInt();


        FunRequest fun = new FunRequest();
        fun.get(choice);

//        if (choice == 1) {
//            thing.get();
//
//        } else {
//            thing.get();
//        }


    }
}
