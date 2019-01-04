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
    private String imagen;
    @Column
    private Boolean estado;

    public Categoria() {
    }

    public Categoria(long id, String nombre, String descripcion, String imagen, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
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
                ", imagen='" + imagen + '\'' +
                ", estado=" + estado +
                '}';
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
