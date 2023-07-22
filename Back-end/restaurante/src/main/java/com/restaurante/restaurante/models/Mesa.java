package com.restaurante.restaurante.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Mesa")
public class Mesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mesaId;

    /*
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mesa", cascade = CascadeType.ALL)
    private List<Horario> horarioList = new ArrayList<>();
    */

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return mesaId == mesa.mesaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesaId);
    }
}
