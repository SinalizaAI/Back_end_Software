package com.sinalizaai.repository;

import com.sinalizaai.model.Sinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SinalRepository extends JpaRepository<Sinal, Integer> {
    List<Sinal> findByAtivoTrue();
}