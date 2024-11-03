package com.vitor.sqsexemplo.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener(queueNames = "${aws.sqs.queue.name}")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
