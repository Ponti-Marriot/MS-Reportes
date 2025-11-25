package com.pontimarriot.reportes.dto;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public record ReservationEventDTO(
        String eventType,
        String reservationId,
        String correlationId,
        OffsetDateTime occurredAt
) {}
