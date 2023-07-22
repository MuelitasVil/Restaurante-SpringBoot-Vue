package com.restaurante.restaurante.controller;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.restaurante.restaurante.Service.UsuarioService;
import com.restaurante.restaurante.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/addUsuario")
    public Usuario addUsuario(@RequestBody Usuario usuario)
    {
        System.out.println("Ingresar usuario : ");
        System.out.println(service.saveUsuario(usuario));
    /*
        Usuario existingUser = service.getUsuarioById(usuario.getUsuarioId());
        if (existingUser.getUsuarioId() == usuario.getUsuarioId()) {

            System.out.println("Usuario ya registrado : ");
            return new Usuario();

        }

        if (existingUser.getUsuarioCorreo() == usuario.getUsuarioCorreo()) {

            System.out.println("Usuario ya registrado : ");
            return new Usuario();

        }
    */

        System.out.println("Registro Completado");
        return service.saveUsuario(usuario);

    }

    @PostMapping("/addUsuarios")
    public List<Usuario> addUsuarios(@RequestBody List<Usuario> usuarios) throws ParseException {
        System.out.println("Ingresar usuarios : ");
        System.out.println(service.saveUsuarios(usuarios));
        return service.saveUsuarios(usuarios);
    }

    @GetMapping("/usuarios")
    public List<Usuario> findAllUsuarios() {
        System.out.println("Encontrar todos los Usuarios : ");
        System.out.println(service.getUsuarios());
        return service.getUsuarios();
    }

    @GetMapping("/usuarioById/{id}")
    public Usuario findUsuarioById(@PathVariable Long id)
    {
        System.out.println("usuario encontrado : ");
        System.out.println(service.getUsuarioById(id));
        return service.getUsuarioById(id);
    }

    @PutMapping("/usarioUpdate")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return service.updateUsuario(usuario);
    }

    @DeleteMapping("/usuarioDelete/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        return service.deleteUsuario(id);
    }
}