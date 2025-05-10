package com.UPIIZ.Examen_II_ATG.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_orden")
    private Long idorden;

    @Column(name = "id_producto")
    private Long idproducto;

    @Column(name = "cantidad")
    private Long cantidad;

    @Column(name = "nombreproducto")
    private String nombreproducto;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdorden() { return idorden; }
    public void setIdorden(Long idorden) { this.idorden = idorden; }

    public String getIdproducto() { return idproducto; }
    public void setIdproducto(Long idproducto) { this.idproducto = idproducto; }

    public LocalDate getcantidad() { return cantidad; }
    public void setcantidad(Long cantidad) { this.cantidad = cantidad; }

    public LocalDate getnombreproducto() { return nombreproducto; }
    public void setNombreproducto(String nombreproducto) { this.nombreproducto = nombreproducto; }
}