package com.pontimarriot.reportes.model;
 
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReservationEvent {
    private String reservationId;
    private String guestId;
    private String roomId;
    private LocalDateTime createdAt;
}
