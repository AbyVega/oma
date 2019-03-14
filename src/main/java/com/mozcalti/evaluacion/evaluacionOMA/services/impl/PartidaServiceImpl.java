/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services.impl;

import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;
import com.mozcalti.evaluacion.evaluacionOMA.repository.PartidaRepository;
import com.mozcalti.evaluacion.evaluacionOMA.services.PartidaServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author abiga
 */
@Service
@Slf4j
public class PartidaServiceImpl implements PartidaServices{
    @Autowired
private PartidaRepository partidaRepository;

    @Override
    public Partida crearPartida(Partida partida) {
        log.info("Usuario a sido guardado con exito");
        return partidaRepository.save(partida);
    }

    @Override
    public Iterable<Partida> showAllPartida() {
    return partidaRepository.findAll();   
    }

    @Override
    public void deletePartida(Integer id) {
    partidaRepository.deleteById(id);
    }

    @Override
    public void deleteAllPartida() {
       partidaRepository.deleteAll();
    }

    @Override
    public Partida showPartidaId(Integer id) {
     return partidaRepository.findById(id).get();
      
    }

   

   
    
}
