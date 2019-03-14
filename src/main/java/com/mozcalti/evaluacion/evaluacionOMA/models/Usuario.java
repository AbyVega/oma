/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author abiga
 */
@Entity
@Table(name="usuario")
@Data
public class Usuario implements Serializable{
    private static final long serialVersionUID= 1L;
        @GeneratedValue(strategy= GenerationType.IDENTITY)   
        @Id
	@Column(name = "idusuario")
	private Integer idusuario;

	@Column(name = "username")
	private String username;
        
        @Column(name = "password")
	private String password;
        
        
         @ManyToMany(fetch = FetchType.EAGER)
         @JoinTable(name = "usuario_has_perfil", joinColumns={@JoinColumn(name="usuario_idusuario")},
                 inverseJoinColumns={@JoinColumn(name="perfil_idperfil")})
    	    private List<Perfil> perfil;

        
}