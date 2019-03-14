/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.configuracion;


import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;




@EnableResourceServer
@Configuration
public class Oauth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Setter(onMethod_ = { @Value("${oauth2.resourceId}") })
	private String resourceId;

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		super.configure(resources);

		resources.resourceId(resourceId);
	}

}
