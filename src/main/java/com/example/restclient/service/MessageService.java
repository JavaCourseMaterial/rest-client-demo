package com.example.restclient.service;

import com.example.restclient.client.MessageClient;
import com.example.restclient.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageClient client;

    public MessageService(MessageClient client) {
        this.client = client;
    }

    public List<Message> getMessages() {
        return this.client.getMessages();
    }
}
