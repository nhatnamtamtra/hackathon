package com.f4.letparty.service;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import org.apache.http.client.HttpClient;
//import org.apache.http.impl.client.DefaultHttpClient;
/**
 * Created by nhatn on 1/7/2017.
 */

public class Service {
    public static String GET(String url){
        InputStream inputStream = null;
        String result = "";
        try {

            // create HttpClient
            //HttpClient httpclient = new DefaultHttpClient();

            // make GET request to the given URL
            //HttpResponse httpResponse = httpclient.execute(new HttpGet(url));

            // receive response as inputStream
            //inputStream = httpResponse.getEntity().getContent();

            // convert inputstream to string
            //if(inputStream != null)
             //   result = convertInputStreamToString(inputStream);
            //else
            //    result = "Did not work!";

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }

        return result;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }

}
