package com.ar.angema.menuapp.productos;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column public String nombre;
    @Column public String descripcion;
    @Column public String sabor;
    @Column public String graduacion;
    @Column public double precio;
    @Column public String imagen;
    @Column(name = "id_categoria") public String idCategoria;


}
