package com.example.restclient.client;

import com.example.restclient.model.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class MessageClient {

    private RestTemplate template;

    public MessageClient(RestTemplate template) {
        this.template = template;
    }

    /**
     * Get all messages...
     *
     * @return a List of Messages
     */
    public List<Message> getMessages() {

        String url = "http://localhost:8080/hello/getAllMessages";
        Message[] messages = template.getForObject(url, Message[].class);

        return Arrays.asList(messages);
    }
}
