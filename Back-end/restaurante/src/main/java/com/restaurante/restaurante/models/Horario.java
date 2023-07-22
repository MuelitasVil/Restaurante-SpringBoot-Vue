package com.restaurante.restaurante.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "Horario")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long horarioId;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioFecha;

    @Column(nullable = false)
    private boolean horarioDisponibilidad;

    /*
    @JoinColumn(name = "mesa",referencedColumnName="mesaId")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("horarioList")
    private Mesa mesa;

    @OneToOne(mappedBy = "horario", cascade = CascadeType.ALL)
    @JsonBackReference
    private Reserva reserva;
    */



    public Long getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Long horarioId) {
        this.horarioId = horarioId;
    }

    public LocalDateTime getHorarioFecha() {
        return horarioFecha;
    }

    public void setHorarioFecha(LocalDateTime horarioFecha) {
        this.horarioFecha = horarioFecha;
    }


    public boolean isHorarioDisponibilidad() {
        return horarioDisponibilidad;
    }

    public boolean getHorarioDisponibilidad() {
        return  this.horarioDisponibilidad;
    }
    public void setHorarioDisponibilidad(boolean horarioDisponibilidad) {
        this.horarioDisponibilidad = horarioDisponibilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return horarioDisponibilidad == horario.horarioDisponibilidad && Objects.equals(horarioId, horario.horarioId) && Objects.equals(horarioFecha, horario.horarioFecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horarioId, horarioFecha, horarioDisponibilidad);
    }
}

