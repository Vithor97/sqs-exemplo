package com.vitor.sqsexemplo.controller;


import com.vitor.sqsexemplo.service.SqsMessageProduceService;
import com.vitor.sqsexemplo.controller.request.ProducerRequest;
import com.vitor.sqsexemplo.controller.response.ProducerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/sqs-exemplo")
public class Controller {

    private final SqsMessageProduceService sqsMessageProduceService;

    public Controller(SqsMessageProduceService sqsMessageProduceService) {
        this.sqsMessageProduceService = sqsMessageProduceService;
    }

    @PostMapping("/send")
    public ResponseEntity<ProducerResponse> producerMessage(@RequestBody ProducerRequest request) {
        sqsMessageProduceService.sendMessage(request.content());
        return ResponseEntity.ok(new ProducerResponse(request.content(), LocalDateTime.now()));
    }
}
