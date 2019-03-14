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


import com.mozcalti.evaluacion.evaluacionOMA.models.Usuario;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@RequiredArgsConstructor(onConstructor_= { @Autowired })
public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;

	private final Usuario usuario;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return StreamSupport.stream(usuario.getPerfil().spliterator(), false)
				.map((p) -> CustomGrantedAuthority.builder().perfil(p).build()).collect(Collectors.toSet());

	}

	@Override
	public String getPassword() {
		return usuario.getPassword();
	}

	@Override
	public String getUsername() {
		return usuario.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
