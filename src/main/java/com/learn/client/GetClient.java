package com.learn.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.swing.*;

public class GetClient {

    public static void main(String[] args) {
        //Input for Client to choose the city
        JFrame frame = new JFrame("What City?");
        String city = JOptionPane.showInputDialog(frame, "What City?");
        //Setting the port number
        int port = 49000;
        //Url
        String getUrl = "http://localhost:" + port + "/api/weather/city";
        //creating client and sending get request to specified url
        Client client = Client.create();
        WebResource target = client.resource(getUrl);

        ClientResponse response = target
                .queryParam("city", city)
                .get(ClientResponse.class);
        //Output for response of the get request
        System.out.println(response.getEntity(String.class));
    }
}