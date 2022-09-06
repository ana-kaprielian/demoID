package com.despegar;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String client) {
       //some code
       System.out.println("Mensaje enviado por email a: " + client);
    }
    
}
