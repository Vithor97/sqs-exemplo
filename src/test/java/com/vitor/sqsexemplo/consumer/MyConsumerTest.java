package com.vitor.sqsexemplo.consumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class MyConsumerTest {

    @MockBean
    private MyConsumer myConsumer;

    @Test
    void consumeValidMessage() {
        String message = "Valid message";
        myConsumer.consume(message);
        Mockito.verify(myConsumer, Mockito.times(1)).consume(message);
    }

    @Test
    void consumeEmptyMessage() {
        String message = "";
        myConsumer.consume(message);
        Mockito.verify(myConsumer, Mockito.times(1)).consume(message);
    }

    @Test
    void consumeNullMessage() {
        String message = null;
        myConsumer.consume(message);
        Mockito.verify(myConsumer, Mockito.times(1)).consume(message);
    }
}