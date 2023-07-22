package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findUsuarioByUsuarioId(Long usuarioId);

}
