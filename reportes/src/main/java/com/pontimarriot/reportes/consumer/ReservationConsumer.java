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

    // ---- CREATED ----
    @Bean
    public Consumer<Message<ReservationEventDTO>> reservationCreated() {
        return message -> {
            log.info("[CREATED] Evento recibido: {}", message);
            ReservationEventDTO event = message.getPayload();
            reportService.saveFromEvent(event);
        };
    }

    // ---- CONFIRMED ----
    @Bean
    public Consumer<Message<ReservationEventDTO>> reservationConfirmed() {
        return message -> {
            log.info("[CONFIRMED] Evento recibido: {}", message);
            ReservationEventDTO event = message.getPayload();
            reportService.saveFromEvent(event);
        };
    }

    // ---- CANCELLED ----
    @Bean
    public Consumer<Message<ReservationEventDTO>> reservationCancelled() {
        return message -> {
            log.info("[CANCELLED] Evento recibido: {}", message);
            ReservationEventDTO event = message.getPayload();
            reportService.saveFromEvent(event);
        };
    }

    // ---- REJECTED ----
    @Bean
    public Consumer<Message<ReservationEventDTO>> reservationRejected() {
        return message -> {
            log.info("[REJECTED] Evento recibido: {}", message);
            ReservationEventDTO event = message.getPayload();
            reportService.saveFromEvent(event);
        };
    }
}
