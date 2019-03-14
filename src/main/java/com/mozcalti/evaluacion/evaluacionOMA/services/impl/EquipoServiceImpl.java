/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services.impl;

import com.mozcalti.evaluacion.evaluacionOMA.models.Equipo;
import com.mozcalti.evaluacion.evaluacionOMA.repository.EquipoRepository;
import com.mozcalti.evaluacion.evaluacionOMA.services.EquipoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oogs_
 */
@Service
@Slf4j
public class EquipoServiceImpl implements EquipoService {
    
    @Autowired
    private EquipoRepository equipoRepository;
    
    @Override
    public Equipo crearEquipo(Equipo equipo) {
        log.info("Equipo a sido guardado con exito");
        return equipoRepository.save(equipo);
    }

    @Override
    public void deleteEquipo(Integer id) {
    equipoRepository.deleteById(id);    
    }

    @Override
    public void deleteAllEquipo() {
    equipoRepository.deleteAll();    
    }

    @Override
    public Equipo showEquipoId(Integer id) {
    return equipoRepository.findById(id).get();        
    }

    @Override
    public Iterable<Equipo> showAllEquipo() {
    return equipoRepository.findAll();           
    }
    
}
