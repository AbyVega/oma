/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services;

import com.mozcalti.evaluacion.evaluacionOMA.models.Hoja;
import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;

/**
 *
 * @author abiga
 */
public interface HojaService {
   Hoja crearHoja(Hoja hoja);
    void deleteHoja(Integer id); 
    void deleteAllHoja(); 
    Hoja showHojaId(Integer id);
    Iterable <Hoja> showAllHoja(); 
}
