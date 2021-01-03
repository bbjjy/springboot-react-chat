package com.example.demo.Controller;

import com.example.demo.Model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @MessageMapping("/hello")
    @SendTo("/topic/roomId")
    public Message boradCast(Message message){
        logger.debug("msg {}",message.toString());
        return message;
    }
}
