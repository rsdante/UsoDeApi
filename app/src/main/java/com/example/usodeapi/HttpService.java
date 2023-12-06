package com.example.usodeapi;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class HttpService extends AsyncTask<Void, Void, Bitcoin> {

    @Override
    protected Bitcoin doInBackground(Void...voids){
        //realizar requisicao e consumir servico
        StringBuilder resposta = new StringBuilder();

        try {
            //acessa o url
            URL url = new URL("https://api.bitpreco.com/btc-brl/ticker");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                resposta.append(scanner.next());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //retorno do formato bitcoin
        return new Gson().fromJson(resposta.toString(), Bitcoin.class);
    }




}
