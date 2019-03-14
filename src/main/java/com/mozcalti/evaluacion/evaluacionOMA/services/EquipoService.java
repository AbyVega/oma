/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services;

import com.mozcalti.evaluacion.evaluacionOMA.models.Equipo;

/**
 *
 * @author oogs_
 */
public interface EquipoService {
    Equipo crearEquipo (Equipo equipo);
    void deleteEquipo(Integer id); 
    void deleteAllEquipo(); 
    Equipo showEquipoId(Integer id);
    Iterable <Equipo> showAllEquipo();
}
