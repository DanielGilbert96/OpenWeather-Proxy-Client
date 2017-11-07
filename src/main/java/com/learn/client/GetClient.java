package com.learn.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.swing.*;

public class GetClient {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Enter The City");
        String city = JOptionPane.showInputDialog(frame, "What's the city?");
        int port = 49000;
        String getUrl = "http://localhost:" + port + "/api/weather/city";
        
        Client client = Client.create();
        WebResource target = client.resource(getUrl);

        ClientResponse response = target
                .queryParam("city", city)
                .get(ClientResponse.class);
        
        System.out.println(response.getEntity(String.class));
    }
}