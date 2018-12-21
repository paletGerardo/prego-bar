package com.ar.maxger.pregobar.entity;

import javax.persistence.*;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id
    @GeneratedValue
    @Column
    private long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Boolean estado;

    public Categoria() {
    }

    public Categoria(long id, String nombre, String descripcion, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
