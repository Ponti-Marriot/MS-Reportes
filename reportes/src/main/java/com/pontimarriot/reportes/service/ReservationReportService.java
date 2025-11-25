package com.pontimarriot.reportes.service;

import com.pontimarriot.reportes.dto.ReservationEventDTO;
import com.pontimarriot.reportes.model.ReportReservation;
import com.pontimarriot.reportes.repository.ReportReservationRepository;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReservationReportService {

    private final ReportReservationRepository repository;

    public ReservationReportService(ReportReservationRepository repository) {
        this.repository = repository;
    }

    public void saveFromEvent(ReservationEventDTO event) {

        ReportReservation report = new ReportReservation(
                UUID.randomUUID().toString(),
                event.eventType(),
                event.reservationId(),
                event.correlationId(),
                event.occurredAt()
        );

        repository.save(report);
    }
}

