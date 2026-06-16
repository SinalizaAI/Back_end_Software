package com.sinalizaai.service;

import com.sinalizaai.model.LogUso;
import com.sinalizaai.repository.LogUsoRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class LogUsoService {

    private final LogUsoRepository logUsoRepository;

    public LogUsoService(LogUsoRepository logUsoRepository) {
        this.logUsoRepository = logUsoRepository;
    }

    public LogUso registrar(String canal) {
        LogUso log = new LogUso();
        log.setCanal(canal);
        log.setCriadoEm(LocalDateTime.now());
        return logUsoRepository.save(log);
    }
}