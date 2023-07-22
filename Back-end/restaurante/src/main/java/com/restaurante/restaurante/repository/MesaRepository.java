package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.models.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Long> {
    Mesa findMesaByMesaId (Long mesaId);

}
