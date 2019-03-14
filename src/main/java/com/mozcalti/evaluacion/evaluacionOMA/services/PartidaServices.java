/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services;

import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;

/**
 *
 * @author abiga
 */
public interface PartidaServices {
    Partida crearPartida(Partida partida);
    void deletePartida(Integer id); 
    void deleteAllPartida(); 
    Partida showPartidaId(Integer id);
    Iterable <Partida> showAllPartida();
}

