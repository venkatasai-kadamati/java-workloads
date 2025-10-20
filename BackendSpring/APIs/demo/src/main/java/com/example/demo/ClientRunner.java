package com.example.demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ClientRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        OkHttpClient client = new OkHttpClient();

        String url = "https://jsonplaceholder.typicode.com/todos/1";

        // The below is part of builder pattern
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if(!response.isSuccessful()){
                throw new IOException("Something went wrong");
            }
            // .string() helps serialize the json structure as a String, without this we will just get an object of http.RealResponseBody@270c0c
            System.out.println(response.body().string());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
