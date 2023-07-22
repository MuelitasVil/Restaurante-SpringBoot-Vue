package com.restaurante.restaurante.Service;

import com.restaurante.restaurante.models.Horario;
import com.restaurante.restaurante.models.Mesa;
import com.restaurante.restaurante.repository.HorarioRepository;
import com.restaurante.restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {

    @Autowired
    private MesaRepository repository;

    public Mesa saveMesa(Mesa mesa) {
        return repository.save(mesa );
    }

    public List<Mesa> saveMesas(List<Mesa> mesas) {
        return repository.saveAll(mesas);
    }

    public List<Mesa> getMesas() {
        return repository.findAll();
    }

    public Mesa getMesaById(Long id) {
        return repository.findMesaByMesaId(id);
    }

    public String deleteMesa(Long id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

}
