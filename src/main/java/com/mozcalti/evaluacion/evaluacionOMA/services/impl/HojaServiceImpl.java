/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services.impl;

import com.mozcalti.evaluacion.evaluacionOMA.models.Hoja;
import com.mozcalti.evaluacion.evaluacionOMA.repository.HojaRepository;
import com.mozcalti.evaluacion.evaluacionOMA.services.HojaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author abiga
 */
@Service
@Slf4j
public class HojaServiceImpl implements HojaService{
    @Autowired
    private HojaRepository hojaRepository;

    @Override
    public Hoja crearHoja(Hoja hoja) {
    log.info("Hoja a sido guardado con exito");
        return hojaRepository.save(hoja);    
    }

    @Override
    public void deleteHoja(Integer id) {
    hojaRepository.deleteById(id);
    }

    @Override
    public void deleteAllHoja() {
    hojaRepository.deleteAll();
    }

    @Override
    public Hoja showHojaId(Integer id) {
    return hojaRepository.findById(id).get();
    }

    @Override
    public Iterable<Hoja> showAllHoja() {
       return hojaRepository.findAll();
    }
    
}
