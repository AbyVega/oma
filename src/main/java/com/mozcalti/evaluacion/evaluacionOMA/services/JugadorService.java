/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services;

import com.mozcalti.evaluacion.evaluacionOMA.models.Hoja;
import com.mozcalti.evaluacion.evaluacionOMA.models.Jugador;



/**
 *
 * @author oogs_
 */
public interface JugadorService {
  Jugador  saveJugador(Jugador jugador);
    Jugador showJugadorId(Integer id);
    Iterable <Jugador> showAllJugador(); 
 void deleteJugador(Integer id);
}