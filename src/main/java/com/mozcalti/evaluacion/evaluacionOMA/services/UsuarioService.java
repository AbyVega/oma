/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.services;

import com.mozcalti.evaluacion.evaluacionOMA.models.Usuario;

/**
 *
 * @author abiga
 */
public interface UsuarioService {
    Usuario createUser(Usuario usuario);

	Usuario recoverUser(Integer id);

	Iterable<Usuario> recoverAllUsers();

	Usuario updateUser(Usuario usuario);

	Boolean deleteUser(Usuario usuario);

	Usuario userByName(String name);
}
