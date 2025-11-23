package com.pontimarriot.reportes.repository;

import com.pontimarriot.reportes.model.ReportReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportReservationRepository extends JpaRepository<ReportReservation, String> {
}
