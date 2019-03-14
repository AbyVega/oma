/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services.impl;

import com.mozcalti.evaluacion.evaluacionOMA.models.Usuario;
import com.mozcalti.evaluacion.evaluacionOMA.repository.UsuarioRepository;
import com.mozcalti.evaluacion.evaluacionOMA.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author abiga
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repositorio;

    @Override
    public Usuario createUser(Usuario usuario) {
    log.debug("Creando usuario {}", usuario);

		if (usuario.getIdusuario() != null) {
			log.error("El usuario ya tiene un identificador");
			throw new RuntimeException("El usuario ya tiene un identificador");
		}

		return repositorio.save(usuario);    
    
    }

    @Override
    public Usuario recoverUser(Integer id) {
    return repositorio.findById(id).get();    
    }

    @Override
    public Iterable<Usuario> recoverAllUsers() {
    return repositorio.findAll();   
    }

    @Override
    public Usuario updateUser(Usuario usuario) {
    log.debug("Actualizando usuario {}", usuario);

		if (usuario.getIdusuario() == null) {
			log.error("El usuario ya tiene un identificador");
			throw new RuntimeException("El usuario ya tiene un identificador");
		}

		return repositorio.save(usuario);   
    }

    @Override
    public Boolean deleteUser(Usuario usuario) {
    try {
			repositorio.delete(usuario);
			return true;
		} catch (Exception e) {
			log.error("No se pudo eliminar el usuario {}", usuario, e);
			return false;
		}    
    }

    @Override
    public Usuario userByName(String name) {
    return repositorio.findByUsername(name);   
    }
    

    
    
}

    

