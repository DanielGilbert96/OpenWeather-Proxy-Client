package com.learn.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.swing.*;

public class GetClient {

    public static void main(String[] args) {
<<<<<<< HEAD
        // Input for client to choose city
        JFrame frame = new JFrame("Enter The City");
        String city = JOptionPane.showInputDialog(frame, "What's the city?");
		// Setting the port
        int port = 49000;
		// Setting Url
        String getUrl = "http://localhost:" + port + "/api/weather/city";
        
		//Creating the client and sending GET request
=======
        
        JFrame frame = new JFrame("Enter The City");
        String city = JOptionPane.showInputDialog(frame, "What's the city?");
        int port = 49000;
        String getUrl = "http://localhost:" + port + "/api/weather/city";
        
>>>>>>> 256db4e436ea4df9077daa0a1eaef9b2f10f27dd
        Client client = Client.create();
        WebResource target = client.resource(getUrl);

        ClientResponse response = target
                .queryParam("city", city)
                .get(ClientResponse.class);
<<<<<<< HEAD
        // Response from get request
=======
        
>>>>>>> 256db4e436ea4df9077daa0a1eaef9b2f10f27dd
        System.out.println(response.getEntity(String.class));
    }
}