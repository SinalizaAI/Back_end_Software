package com.sinalizaai.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logs_uso")
public class LogUso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String canal;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm;

    public Integer getId() { return id; }
    public String getCanal() { return canal; }
    public LocalDateTime getCriadoEm() { return criadoEm; }

    public void setId(Integer id) { this.id = id; }
    public void setCanal(String canal) { this.canal = canal; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }
}