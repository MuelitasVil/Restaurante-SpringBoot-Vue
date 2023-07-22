package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.models.Horario;
import com.restaurante.restaurante.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Long> {

    Horario findHorarioByHorarioId(Long horarioId);

}
