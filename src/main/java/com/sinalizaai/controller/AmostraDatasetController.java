package com.sinalizaai.controller;

import com.sinalizaai.model.AmostraDataset;
import com.sinalizaai.service.AmostraDatasetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/amostras")
public class AmostraDatasetController {

    private final AmostraDatasetService service;

    public AmostraDatasetController(AmostraDatasetService service) {
        this.service = service;
    }

    @GetMapping
    public List<AmostraDataset> listarTodas() {
        return service.listarTodas();
    }
}