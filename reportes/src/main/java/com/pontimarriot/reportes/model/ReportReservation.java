package com.pontimarriot.reportes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

@Entity
@Table(name = "report_reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportReservation {

    @Id
    private String id;
    String eventType;
    String reservationId;
    String correlationId;
    OffsetDateTime occurredAt;
}

