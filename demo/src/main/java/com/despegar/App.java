package com.despegar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // ClientRepository clientRepository = new ClientRepository();
        // MessageService messageService = new WhatsAppService();
        
        // NotificationService notificationService = new NotificationService(messageService, clientRepository);

        // notificationService.notifyClients();

        
    
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        ClientRepository clientRepository = context.getBean("Clients", ClientRepository.class);
        
        int res = clientRepository.getClients().size();
        System.out.println(res);

    }
}
