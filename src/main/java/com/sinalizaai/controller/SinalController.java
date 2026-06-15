package com.sinalizaai.controller;

import com.sinalizaai.model.Sinal;
import com.sinalizaai.service.SinalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sinais")
@CrossOrigin(origins = "*")
public class SinalController {

    private final SinalService sinalService;

    public SinalController(SinalService sinalService) {
        this.sinalService = sinalService;
    }

    @GetMapping
    public ResponseEntity<List<Sinal>> listarSinais() {
        List<Sinal> sinais = sinalService.listarAtivos();
        return ResponseEntity.ok(sinais);
    }
}