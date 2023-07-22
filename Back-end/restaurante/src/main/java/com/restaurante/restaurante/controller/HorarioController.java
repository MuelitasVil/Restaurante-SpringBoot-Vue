package com.restaurante.restaurante.controller;


import com.restaurante.restaurante.Service.HorarioService;
import com.restaurante.restaurante.Service.UsuarioService;
import com.restaurante.restaurante.models.Horario;
import com.restaurante.restaurante.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class HorarioController {

    @Autowired
    private HorarioService service;

    @PostMapping("/addHorario")
    public Horario addHorario(@RequestBody Horario horario)
    {
        System.out.println("Ingresar horario : ");
        System.out.println(service.saveHorario(horario));
        System.out.println("Registro Completado");

        return service.saveHorario(horario);

    }

    @PostMapping("/addHorarios")
    public List<Horario> addUsuarios(@RequestBody List<Horario> horarios) {
        System.out.println("Ingresar usuarios : ");
        System.out.println(service.saveHorarios(horarios));
        return service.saveHorarios(horarios);
    }

    @GetMapping("/horarios")
    public List<Horario> findAllUsuarios() {
        System.out.println("Encontrar todos los Usuarios : ");
        System.out.println(service.getHorarios());
        return service.getHorarios();
    }

    @GetMapping("/HorarioById/{id}")
    public Horario
    findUsuarioById(@PathVariable Long id)
    {
        System.out.println("usuario encontrado : ");
        System.out.println(service.getHorarioById(id));
        return service.getHorarioById(id);
    }

    @PutMapping("/horarioUpdate")
    public Horario updateHorario(@RequestBody Horario horario) {
        return service.updateHorario(horario);
    }

    @DeleteMapping("/horarioDelete/{id}")
    public String deleteHorario(@PathVariable Long id) {
        return service.deleteHorario(id);
    }
}