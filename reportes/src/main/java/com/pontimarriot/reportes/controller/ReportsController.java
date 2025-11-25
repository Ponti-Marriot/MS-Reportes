package com.pontimarriot.reportes.controller;

import com.pontimarriot.reportes.model.ReportReservation;
import com.pontimarriot.reportes.repository.ReportReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportes")
public class ReportsController {

    private final ReportReservationRepository repository;

    public ReportsController(ReportReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/reservas")
    public List<ReportReservation> obtenerReservas() {
        return repository.findAll();
    }
}
