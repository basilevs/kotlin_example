// Source - https://stackoverflow.com/q/79829352
// Posted by kiruba T, modified by community. See post 'Timeline' for change history
// Retrieved 2025-11-25, License - CC BY-SA 4.0

package com.example.kotlin;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class OkHttpTest {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient(); // ClassNotFoundException occurs here
        Request request = new Request.Builder()
                .url("https://www.google.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
