/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author abiga
 */
@Entity
@Table(name="hojas")
@Data
public class Hoja implements Serializable{
        private static final long serialVersioUID =1L;
        
        @Id
	@Column(name = "idhojas")
	private Integer idhojas;

	@Column(name = "puntaje")
	private Integer puntaje;
         //@JsonIgnore
     @ManyToOne(fetch = FetchType.EAGER)
         @JoinColumn(name = "partida")
    	    private Partida partida;
     
     @ManyToOne(fetch = FetchType.EAGER)
         @JoinColumn(name = "jugador")
    	    private Jugador jugador;
    
}

    

