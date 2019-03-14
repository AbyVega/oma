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
@Table(name="jugador")
@Data
public class Jugador implements Serializable{
         private static final long serialVersionUID= 1L;
        @Id
	@Column(name = "idjugador")
	private Integer idjugador;

	@Column(name = "nombre")
	private String nombre;
        
        @ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="equipo")
        private Equipo equipo;
        
}

