/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services.impl;

import com.mozcalti.evaluacion.evaluacionOMA.models.Jugador;
import com.mozcalti.evaluacion.evaluacionOMA.repository.JugadorRepository;
import com.mozcalti.evaluacion.evaluacionOMA.services.JugadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oogs_
 */
@Service
@Slf4j
public class JugadorServiceImpl implements JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Override
    public Jugador saveJugador(Jugador jugador) {
        log.info("Jugador a sido guardado con exito");
         return jugadorRepository.save(jugador);
    }

    @Override
    public void deleteJugador(Integer id) {
     jugadorRepository.deleteById(id);    
    }

   
    
   

    @Override
    public Jugador showJugadorId(Integer id) {
       return jugadorRepository.findById(id).get();
      
    }

    @Override
    public Iterable<Jugador> showAllJugador() {
        return jugadorRepository.findAll();    
    }
}
