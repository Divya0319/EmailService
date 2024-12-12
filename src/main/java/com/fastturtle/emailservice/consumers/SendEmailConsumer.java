package com.fastturtle.emailservice.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fastturtle.emailservice.dtos.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendEmailConsumer {

    @Autowired
    private ObjectMapper objectMapper;

    public void sendEmail(String message) {

        try {
            EmailDTO emailDTO = objectMapper.readValue(message, EmailDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
