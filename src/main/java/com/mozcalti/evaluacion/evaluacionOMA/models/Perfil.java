/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author abiga
 */
@Entity
@Table(name="perfil")
@Data
public class Perfil implements Serializable{
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="idperfil")
    private Integer idperfil;
    @Column(name="tipo")
    private String tipo;

      
}

