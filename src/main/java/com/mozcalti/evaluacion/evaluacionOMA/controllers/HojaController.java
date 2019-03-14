/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.controllers;

import com.mozcalti.evaluacion.evaluacionOMA.models.Hoja;
import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;
import com.mozcalti.evaluacion.evaluacionOMA.services.HojaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author abiga
 */
@RestController
@RequestMapping("hoja")
public class HojaController {
    @Autowired
    private HojaService hojaService;
    
    @PostMapping("/create")  
    public Hoja createHoja(@RequestBody Hoja hoja){
      return hojaService.crearHoja(hoja);
      
     
     
    }
     @GetMapping("/show/all")
      public Iterable<Hoja>showAllHoja(){
          return hojaService.showAllHoja();
                  
      }
      
  
     @DeleteMapping("/delete/{id}")//busca un solo parametro
      public void deleteHojaId(@PathVariable Integer id){//eliminar por id
        hojaService.deleteHoja(id);
    }
      @DeleteMapping("/delete/all")
      public void deleteAllHoja(){
          hojaService.deleteAllHoja();
      }
      @GetMapping("/show/hojaId")
      public Hoja showHojaId(Integer id){
          return hojaService.showHojaId(id);
      }
      
}


