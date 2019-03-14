/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.controllers;

import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;
import com.mozcalti.evaluacion.evaluacionOMA.services.PartidaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abiga
 */
@RestController
@RequestMapping("par")
public class PartidaController {
    @Autowired 
    private PartidaServices partidaService;
    
    @PostMapping("/create")  
    public Partida createPartida(@RequestBody Partida partida){
      return partidaService.crearPartida(partida);
      
     
     
    }
     @GetMapping("/show/all/partida")
      public Iterable<Partida>showAllPartida(){
          return partidaService.showAllPartida();
                  
      }
      
      
   /* @DeleteMapping("/delete")//los dos funcionan para eliminar
      public void deletePartida(Integer id){
        userService.deletePartida(id);
    }*/
    
     @DeleteMapping("/delete/{id}")//busca un solo parametro
      public void deletePartidaId(@PathVariable Integer id){//eliminar por id
        partidaService.deletePartida(id);
    }
      @DeleteMapping("/delete/all")
      public void deleteAllUser(){
          partidaService.deleteAllPartida();
      }
      @GetMapping("/show/partidaId")
      public Partida showPartidaId(Integer id){
          return partidaService.showPartidaId(id);
      }
      
}
