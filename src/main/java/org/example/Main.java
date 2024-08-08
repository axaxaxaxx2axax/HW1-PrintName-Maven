package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        PrintName printName = new PrintName("Anastasiia", "Izotova");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(printName);

        System.out.println(json);
    }
}