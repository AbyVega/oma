/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.repository;

import com.mozcalti.evaluacion.evaluacionOMA.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author oogs_
 */
public interface EquipoRepository extends CrudRepository<Equipo, Integer> {
    
}
