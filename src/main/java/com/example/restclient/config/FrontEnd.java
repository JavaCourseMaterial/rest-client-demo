package com.example.restclient.config;

import com.example.restclient.model.Message;
import com.example.restclient.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FrontEnd implements CommandLineRunner {

    MessageService service;

    public FrontEnd(MessageService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Message> messages = service.getMessages();

        messages.forEach(System.out::println);
    }
}
