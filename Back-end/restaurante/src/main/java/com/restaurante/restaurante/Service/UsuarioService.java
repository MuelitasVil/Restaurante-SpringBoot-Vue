package com.restaurante.restaurante.Service;

import com.restaurante.restaurante.models.Usuario;
import com.restaurante.restaurante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario saveUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> saveUsuarios(List<Usuario> usuarios) {
        return repository.saveAll(usuarios);
    }

    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return repository.findUsuarioByUsuarioId(id);
    }

    public String deleteUsuario(Long id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Usuario updateUsuario(Usuario usuario) {
        Usuario existingProduct = repository.findById(usuario.getUsuarioId()).orElse(null);
        existingProduct.setUsuarioNombres(usuario.getUsuarioNombres());
        existingProduct.setUsuarioApellidos(usuario.getUsuarioApellidos());
        existingProduct.setUsuarioContraseña(usuario.getUsuarioContraseña());
        return repository.save(existingProduct);
    }


}