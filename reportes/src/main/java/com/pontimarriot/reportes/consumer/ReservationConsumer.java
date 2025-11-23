package com.pontimarriot.reportes.consumer;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import com.pontimarriot.reportes.dto.ReservationEventDTO;
import com.pontimarriot.reportes.service.ReservationReportService;

@Configuration
public class ReservationConsumer {

    private static final Logger log = LoggerFactory.getLogger(ReservationConsumer.class);

    private final ReservationReportService reportService;

    public ReservationConsumer(ReservationReportService reportService) {
        this.reportService = reportService;
    }

    @Bean
    public Consumer<Message<ReservationEventDTO>> reservationCreated() {
        return message -> {
            log.info("Evento recibido: {}", message);
            log.info("Payload: {}", message.getPayload());

            ReservationEventDTO event = message.getPayload();

            // Guardar en BD del microservicio
            reportService.saveFromEvent(event);
        };
    }
}
