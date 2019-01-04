package com.ar.maxger.pregobar.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue
    @Column
    private long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String sabor;
    @Column
    private String graduacion;
    @Column
    private double precio;
    @Column
    private String imagen;
    @Column(name = "id_categoria")
    private String idCategoria;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String sabor, String graduacion, double precio, String imagen, String idCategoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sabor = sabor;
        this.graduacion = graduacion;
        this.precio = precio;
        this.imagen = imagen;
        this.idCategoria = idCategoria;
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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", sabor='" + sabor + '\'' +
                ", graduacion='" + graduacion + '\'' +
                ", precio=" + precio +
                ", imagen='" + imagen + '\'' +
                '}';
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
}
