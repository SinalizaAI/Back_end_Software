package com.sinalizaai.controller;

import com.sinalizaai.model.LogUso;
import com.sinalizaai.service.LogUsoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/logs")
@CrossOrigin(origins = "*")
public class LogUsoController {

    private final LogUsoService logUsoService;

    public LogUsoController(LogUsoService logUsoService) {
        this.logUsoService = logUsoService;
    }

    @PostMapping("/uso")
    public ResponseEntity<LogUso> registrarUso(@RequestBody Map<String, String> body) {
        String canal = body.get("canal");
        LogUso log = logUsoService.registrar(canal);
        return ResponseEntity.ok(log);
    }
}
