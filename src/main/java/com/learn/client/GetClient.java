package com.learn.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.swing.*;

public class GetClient {

    public static void main(String[] args) {
        // Input for client to choose city
        JFrame frame = new JFrame("Enter The City");
        String city = JOptionPane.showInputDialog(frame, "What's the city?");
		// Setting the port
        int port = 49000;
		// Setting Url
        String getUrl = "http://localhost:" + port + "/api/weather/city";
    
        
		
        Client client = Client.create();
        WebResource target = client.resource(getUrl);

        ClientResponse response = target
                .queryParam("city", city)
                .get(ClientResponse.class);
        // Response from get request
        
        System.out.println(response.getEntity(String.class));
    }
}