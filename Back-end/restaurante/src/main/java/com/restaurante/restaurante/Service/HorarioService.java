package com.restaurante.restaurante.Service;

import ch.qos.logback.core.joran.spi.HostClassAndPropertyDouble;
import com.restaurante.restaurante.models.Horario;
import com.restaurante.restaurante.models.Usuario;
import com.restaurante.restaurante.repository.HorarioRepository;
import com.restaurante.restaurante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository repository;

    public Horario saveHorario(Horario horario) {
        return repository.save(horario );
    }

    public List<Horario> saveHorarios(List<Horario> horarios) {
        return repository.saveAll(horarios);
    }

    public List<Horario> getHorarios() {
        return repository.findAll();
    }

    public Horario getHorarioById(Long id) {
        return repository.findHorarioByHorarioId(id);
    }

    public String deleteHorario(Long id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Horario updateHorario(Horario horario) {
        Horario existingProduct = repository.findById(horario.getHorarioId()).orElse(null);

        existingProduct.setHorarioFecha(horario.getHorarioFecha());
        existingProduct.setHorarioDisponibilidad(horario.getHorarioDisponibilidad());
        return repository.save(existingProduct);

    }

}
