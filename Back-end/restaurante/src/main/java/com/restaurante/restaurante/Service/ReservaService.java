package com.restaurante.restaurante.Service;

import com.restaurante.restaurante.models.Reserva;
import com.restaurante.restaurante.models.Reserva;
import com.restaurante.restaurante.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public Reserva saveReserva(Reserva Reserva) {
        return repository.save(Reserva);
    }

    public List<Reserva> saveReservas(List<Reserva> Reservas) {
        return repository.saveAll(Reservas);
    }

    public List<Reserva> getReservas() {
        return repository.findAll();
    }

    public Reserva getReservaById(Long id) {
        return repository.findReservaByReservaId(id);
    }

    public String deleteReserva(Long id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Reserva updateReserva(Reserva Reserva) {
        Reserva existingProduct = repository.findById(Reserva.getReservaId()).orElse(null);
        existingProduct.setReservaFecha(Reserva.getReservaFecha());
        existingProduct.setCancelacion(Reserva.getCancelacion());
        existingProduct.setReservaFecha(Reserva.getReservaFecha());
        return repository.save(existingProduct);
    }

}
