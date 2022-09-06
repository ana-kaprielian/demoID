package com.despegar;

import org.springframework.beans.factory.annotation.Autowired;

public class NotificationService {
    private MessageService messageService;
    private ClientRepository clientRepository;
    
    @Autowired
    public NotificationService(MessageService messageService, ClientRepository clientRepository) {
        this.messageService = messageService;
        this.clientRepository = clientRepository;
    }

    public void notifyClients(){
        clientRepository.getClients().forEach(messageService::sendMessage);
    }
    
}
