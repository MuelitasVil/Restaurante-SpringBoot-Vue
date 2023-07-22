package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends  JpaRepository<Reserva,Long> {

    Reserva findReservaByReservaId(Long reservaId);
}
