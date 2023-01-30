package com.cities.countries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id;
    private String nome;
    private String nome_pt;
    private String sigla;
    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNome_pt() {
        return nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getBacen() {
        return bacen;
    }
}
