package com.example.weiyanapp;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class QueryString {
    HttpURLConnection con = null;

    public int LoginServer(String i,String j) throws IOException {
        String str_url = "http://aiying.club/login/"+i+"/"+j;
        URL url = new URL(str_url);
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(8000);
        con.setReadTimeout(8000);
        InputStream in = con.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder response = new StringBuilder();
        String str;

        while ((str = reader.readLine()) != null) {
            response.append(str);
            Log.d("myWeather", str);

        }
        if(response==null)
            return 0;
        else {
            String responseStr = response.toString();
            Log.d("myWeather", responseStr);
            return 1;
        }
    }
    public int RegisterServer(String uname,String upwd) throws IOException {
        String str_url = "http://aiying.club/register/"+uname+"/"+upwd;
        URL url = new URL(str_url);
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(8000);
        con.setReadTimeout(8000);
        InputStream in = con.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder response = new StringBuilder();
        String str;

        while ((str = reader.readLine()) != null) {
            response.append(str);
            Log.d("myWeather", str);

        }
        if(response==null)
            return 0;
        else {
            String responseStr = response.toString();
            Log.d("myWeather", responseStr);
            return 1;
        }
    }






    /*public int RegisterServer(String uname,String upwd, String uemail, String ustatus) throws IOException {
        String str_url = "http://154.8.139.211/register/"+uname+"/"+upwd+"/"+uemail+"/"+ustatus;
        URL url = new URL(str_url);



        InputStream in = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder result = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            result.append(line);
        }




        if(result.toString()==null)
            return 0;
        else {
            String responseStr = result.toString();
            Log.d("myWeather", responseStr);
            return 1;
        }
    }*/
}
