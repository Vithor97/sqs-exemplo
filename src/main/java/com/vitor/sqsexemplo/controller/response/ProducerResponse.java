package com.vitor.sqsexemplo.controller.response;

import java.time.LocalDateTime;

public record ProducerResponse (String content,
                                LocalDateTime createdAt) {
}
