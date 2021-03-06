/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.repository;

import com.mozcalti.evaluacion.evaluacionOMA.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author abiga
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    Usuario findByUsername(String username);
}