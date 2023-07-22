package com.restaurante.restaurante.controller;

import com.restaurante.restaurante.Service.HorarioService;
import com.restaurante.restaurante.Service.ReservaService;
import com.restaurante.restaurante.models.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService service;

    @PostMapping("/addReserva")
    public Reserva addHorario(@RequestBody Reserva reserva)
    {
        System.out.println("Ingresar Reserva : ");
        System.out.println(service.saveReserva(reserva));
        System.out.println("Registro Completado");

        return service.saveReserva(reserva);

    }

    @PostMapping("/addReservas")
    public List<Reserva> addHorarios(@RequestBody List<Reserva> reservas) {
        System.out.println("Ingresar usuarios : ");
        System.out.println(service.saveReservas(reservas));
        return service.saveReservas(reservas);
    }

    @GetMapping("/reservas")
    public List<Reserva> findAllUsuarios() {
        System.out.println("Encontrar todos los Usuarios : ");
        System.out.println(service.getReservas());
        return service.getReservas();
    }

    @GetMapping("/ReservaById/{id}")
    public Reserva
    findUsuarioById(@PathVariable Long id)
    {
        System.out.println("reserva encontrado : ");
        System.out.println(service.getReservaById(id));
        return service.getReservaById(id);
    }

    @PutMapping("/reservaUpdate")
    public Reserva updateProduct(@RequestBody Reserva reserva) {
        return service.updateReserva(reserva);
    }

    @DeleteMapping("/reservaDelete/{id}")
    public String deleteReserva(@PathVariable Long id) {
        return service.deleteReserva(id);
    }
}
