package com.sinalizaai.repository;

import com.sinalizaai.model.UsuarioAdm;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioAdmRepository extends JpaRepository<UsuarioAdm, Integer> {
    Optional<UsuarioAdm> findByEmail(String email);
}