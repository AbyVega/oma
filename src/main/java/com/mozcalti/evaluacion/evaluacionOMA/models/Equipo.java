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
@Table(name = "equipo")
@Data
public class Equipo implements Serializable{
 private static final long serialVersionUID= 1L;
	@Id
	@Column(name = "idequipo")
	private Integer idequipo;

	@Column(name = "nombre")
	private String nombre;
        
       


}
