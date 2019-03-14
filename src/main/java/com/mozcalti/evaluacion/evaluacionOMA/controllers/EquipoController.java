/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.controllers;

import com.mozcalti.evaluacion.evaluacionOMA.models.Equipo;
import com.mozcalti.evaluacion.evaluacionOMA.models.Partida;
import com.mozcalti.evaluacion.evaluacionOMA.services.EquipoService;
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
 * @author oogs_
 */
@RestController
@RequestMapping("equipo")
public class EquipoController {
    @Autowired 
    private EquipoService equipoService;
    
    @PostMapping("/create")  
    public Equipo createEquipo(@RequestBody Equipo equipo){
      return equipoService.crearEquipo(equipo);
      
     
     
    }
    @GetMapping("/show/all")
    public Iterable<Equipo> showAllEquipo(){
        return equipoService.showAllEquipo();
}
    @DeleteMapping("/delete/{id}")//busca un solo parametro
      public void deleteEquipoId(@PathVariable Integer id){//eliminar por id
        equipoService.deleteEquipo(id);
    }
      @DeleteMapping("/delete/all")
      public void deleteAllEquipo(){
          equipoService.deleteAllEquipo();
      }
      @GetMapping("/show/equipoId")
      public Equipo showEquipoId(Integer id){
          return equipoService.showEquipoId(id);
      }
}
