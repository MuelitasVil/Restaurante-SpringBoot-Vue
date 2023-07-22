package com.restaurante.restaurante.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    private Long usuarioId;
    @Column(nullable = false)
    private String usuarioNombres;
    @Column(nullable = false)
    private String usuarioApellidos;

    @Column(nullable = false, unique = true)
    private String usuarioCorreo;

    @Column(nullable = false)
    private String usuarioContraseña;

    @Column(nullable = false)
    private String usuarioRol;

    /*
    @Column(nullable = true)
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Reserva> reservaList = new ArrayList<>();
    */

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNombres() {
        return usuarioNombres;
    }

    public void setUsuarioNombres(String usuarioNombres) {
        this.usuarioNombres = usuarioNombres;
    }

    public String getUsuarioApellidos() {
        return usuarioApellidos;
    }

    public void setUsuarioApellidos(String usuarioApellidos) {
        this.usuarioApellidos = usuarioApellidos;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getUsuarioContraseña() {
        return usuarioContraseña;
    }

    public void setUsuarioContraseña(String usuarioContraseña) {
        this.usuarioContraseña = usuarioContraseña;
    }

    public String getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(String usuarioRol) {
        this.usuarioRol = usuarioRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(usuarioId, usuario.usuarioId) && Objects.equals(usuarioNombres, usuario.usuarioNombres) && Objects.equals(usuarioApellidos, usuario.usuarioApellidos) && Objects.equals(usuarioCorreo, usuario.usuarioCorreo) && Objects.equals(usuarioContraseña, usuario.usuarioContraseña) && Objects.equals(usuarioRol, usuario.usuarioRol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, usuarioNombres, usuarioApellidos, usuarioCorreo, usuarioContraseña, usuarioRol);
    }
}
