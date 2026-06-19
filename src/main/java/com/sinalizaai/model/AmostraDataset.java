package com.sinalizaai.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "amostras_dataset")
public class AmostraDataset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sinais_id", nullable = false)
    private Integer sinaisId;

    @Column(nullable = false)
    private String arquivo;

    @Column(name = "gravado_por", nullable = false)
    private String gravadoPor;

    private String status;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm;

    // Getters e Setters
    public Integer getId() { return id; }
    public Integer getSinaisId() { return sinaisId; }
    public String getArquivo() { return arquivo; }
    public String getGravadoPor() { return gravadoPor; }
    public String getStatus() { return status; }
    public LocalDateTime getCriadoEm() { return criadoEm; }

    public void setId(Integer id) { this.id = id; }
    public void setSinaisId(Integer sinaisId) { this.sinaisId = sinaisId; }
    public void setArquivo(String arquivo) { this.arquivo = arquivo; }
    public void setGravadoPor(String gravadoPor) { this.gravadoPor = gravadoPor; }
    public void setStatus(String status) { this.status = status; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }
}