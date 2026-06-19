package com.sinalizaai.service;

import com.sinalizaai.model.AmostraDataset;
import com.sinalizaai.repository.AmostraDatasetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmostraDatasetService {

    private final AmostraDatasetRepository repository;

    public AmostraDatasetService(AmostraDatasetRepository repository) {
        this.repository = repository;
    }

    public List<AmostraDataset> listarTodas() {
        return repository.findAll();
    }
}