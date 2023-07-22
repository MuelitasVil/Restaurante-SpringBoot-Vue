package com.restaurante.restaurante.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservaId;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservaFecha;

    @Column(nullable = false)
    private Long usuarioId;

    @Column(nullable = false)
    private boolean cancelacion;

    @Column(nullable = false)
    private Long horarioId;

    /*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuarioId", nullable = false)
    @JsonIgnoreProperties("reservaList")
    private Usuario usuario;
    */

    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "horario_id")
    @JsonManagedReference
    private Horario horario;
    */


    public Long getReservaId() {
        return reservaId;
    }

    public void setReservaId(Long reservaId) {
        this.reservaId = reservaId;
    }

    public Date getReservaFecha() {
        return reservaFecha;
    }

    public void setReservaFecha(Date reservaFecha) {
        this.reservaFecha = reservaFecha;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setCancelacion(boolean cancelacion) {
        this.cancelacion = cancelacion;
    }

    public boolean getCancelacion() {
        return this.cancelacion;
    }

    public Long getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Long horarioId) {
        this.horarioId = horarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return cancelacion == reserva.cancelacion && Objects.equals(reservaId, reserva.reservaId) && Objects.equals(reservaFecha, reserva.reservaFecha) && Objects.equals(usuarioId, reserva.usuarioId) && Objects.equals(horarioId, reserva.horarioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservaId, reservaFecha, usuarioId, cancelacion, horarioId);
    }

    public boolean isCancelacion() {
        return cancelacion;
    }

}