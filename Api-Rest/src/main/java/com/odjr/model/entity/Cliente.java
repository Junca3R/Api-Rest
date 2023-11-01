package com.odjr.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor// agregar todos los constructores
@NoArgsConstructor//agregar constructores vacios
@ToString
@Entity//entidad
@Table (name = "clientes")//tabla con el nombre de la tabla
public class Cliente implements Serializable {//serializar la clase
//entidades

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    //lombok agrega todos los datos como los getters y setters



}
