package com.restaurante.restaurante.controller;

import com.restaurante.restaurante.Service.MesaService;
import com.restaurante.restaurante.Service.ReservaService;
import com.restaurante.restaurante.models.Mesa;
import com.restaurante.restaurante.models.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MesaController {

    @Autowired
    private MesaService service;

    @PostMapping("/addMesa")
    public Mesa addMesa(@RequestBody Mesa mesa)
    {
        System.out.println("Ingresar Reserva : ");
        System.out.println(service.saveMesa(mesa));
        System.out.println("Registro Completado");
        return service.saveMesa(mesa);

    }

    @PostMapping("/addMesas")
    public List<Mesa> addMesas(@RequestBody List<Mesa> mesas) {
        System.out.println("Ingresar usuarios : ");
        System.out.println(service.saveMesas(mesas));
        return service.saveMesas(mesas);
    }

    @GetMapping("/mesas")
    public List<Mesa> findAllUsuarios() {
        System.out.println("Encontrar todos los Usuarios : ");
        System.out.println(service.getMesas());
        return service.getMesas();
    }

    @GetMapping("/mesaById/{id}")
    public Mesa findUsuarioById(@PathVariable Long id)
    {
        System.out.println("reserva encontrado : ");
        System.out.println(service.getMesaById(id));
        return service.getMesaById(id);
    }

    @DeleteMapping("/mesaDelete/{id}")
    public String deleteReserva(@PathVariable Long id) {
        return service.deleteMesa(id);
    }
}
