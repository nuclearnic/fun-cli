package com.nuclearnic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FunRequest {

    public static void get(int choice) throws IOException {

        System.out.println("HELLO");

        String thing;
        if (choice == 1) {
          thing = "https://api.chucknorris.io/jokes/random";
        } else {
            thing = "https://api.chucknorris.io/jokes/random";
        }

        URL url = new URL(thing);
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

}
