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

        if (choice == 1) {
            try {

                URL url = new URL("https://api.chucknorris.io/jokes/random");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestProperty("User-Agent", "Mozilla/5.0");
                con.setRequestMethod("GET");


                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));

                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                System.out.println(String.format("%s", content));

                in.close();
            }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Nope");
        }


    }
}
