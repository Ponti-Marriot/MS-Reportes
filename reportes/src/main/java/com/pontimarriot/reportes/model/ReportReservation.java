package com.pontimarriot.reportes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "report_reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportReservation {

    @Id
    private String id;

    private String reservation_id;
    private String guestId;
    private String roomId;

    private LocalDateTime createdAt;
}

