/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.controllers;

import com.mozcalti.evaluacion.evaluacionOMA.models.Hoja;
import com.mozcalti.evaluacion.evaluacionOMA.models.Jugador;
import com.mozcalti.evaluacion.evaluacionOMA.services.HojaService;
import com.mozcalti.evaluacion.evaluacionOMA.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author abiga
 */
@RestController
@RequestMapping("jugador")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;
    
    @PostMapping("/create")  
    public Jugador createJugador(@RequestBody Jugador jugador){
      return jugadorService.saveJugador(jugador);
      
     
     
    }
     @GetMapping("/show/all")
      public Iterable<Jugador>showAllJugador(){
          return jugadorService.showAllJugador();
                  
      }
      
  
    
      
}


