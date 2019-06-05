package com.ar.angema.menuapp.categoria;

import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long     id;
    public String   nombre;
    public String   descripcion;
    public String   imagen;
    public Boolean  estado;

}
