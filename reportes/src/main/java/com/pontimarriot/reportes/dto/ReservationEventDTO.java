package com.pontimarriot.reportes.dto;

import java.time.LocalDateTime;

public record ReservationEventDTO(
        String reservationId,
        String guestId,
        String roomId,
        LocalDateTime createdAt
) {}
