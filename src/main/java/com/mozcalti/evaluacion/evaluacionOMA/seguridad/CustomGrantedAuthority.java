/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.seguridad;



/**
 *
 * @author Ivan
 */


import com.mozcalti.evaluacion.evaluacionOMA.models.Perfil;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;

@Builder
public class CustomGrantedAuthority implements GrantedAuthority {

    
	private static final long serialVersionUID = 1L;

	private final Perfil perfil;

	@Override
	public String getAuthority() {
		return String.format("TIPO", perfil.getTipo());
	}

}
