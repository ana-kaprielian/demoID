package com.despegar;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("Clients")
public class ClientRepository {
    private List<String> clients = List.of("client1", "client2");

    public List<String> getClients(){
        return this.clients;
    }

}
