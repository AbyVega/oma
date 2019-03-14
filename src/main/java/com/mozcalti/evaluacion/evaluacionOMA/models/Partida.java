/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author abiga
 */
@Entity
@Table(name="partida")
@Data
public class Partida implements Serializable{
    private static final long serialVersionUID= 1L;
        @Id
	@Column(name = "idpartida")
	private Integer idPartida;

	@Column(name = "identificador")
	private String identificador;
         //@JsonIgnore
     @ManyToMany(fetch = FetchType.EAGER)
         @JoinTable(name = "partida_has_equipo", joinColumns={@JoinColumn(name="partida_idpartida")},
                 inverseJoinColumns={@JoinColumn(name="equipo_idequipo")})
    	    private List<Equipo> equipos;
    
}
