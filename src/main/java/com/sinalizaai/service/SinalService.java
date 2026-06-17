package com.sinalizaai.service;

import com.sinalizaai.model.Sinal;
import com.sinalizaai.repository.SinalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SinalService {

    private final SinalRepository sinalRepository;

    public SinalService(SinalRepository sinalRepository) {
        this.sinalRepository = sinalRepository;
    }

    public List<Sinal> listarAtivos() {
        return sinalRepository.findByAtivoTrue();
    }
}

public Sinal salvar(Sinal sinal) {
    return sinalRepository.save(sinal);
}