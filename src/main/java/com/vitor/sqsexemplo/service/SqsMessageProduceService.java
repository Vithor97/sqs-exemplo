package com.vitor.sqsexemplo.service;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SqsMessageProduceService {


    private final SqsTemplate sqsTemplate;

    @Autowired
    public SqsMessageProduceService(SqsTemplate sqsTemplate) {
        this.sqsTemplate = sqsTemplate;
    }

    public void sendMessage(String message) {
        sqsTemplate.send(message);
    }
}
