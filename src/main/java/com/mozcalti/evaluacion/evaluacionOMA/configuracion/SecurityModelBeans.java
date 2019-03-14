/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozcalti.evaluacion.evaluacionOMA.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;



import lombok.Setter;

@Configuration
@Setter
public class SecurityModelBeans {

	@Value("${oauth2.jwt.key}")
	private String tokenKey;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AccessTokenConverter jwtAccessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey(tokenKey);
		return tokenConverter;
	}

	@Bean
	@Autowired
	public TokenStore tokenStore(JwtAccessTokenConverter accessTokenConverter) {
		return new JwtTokenStore(accessTokenConverter);
	}

	@Bean
	@Autowired
	public DefaultTokenServices defaultTokenServices(TokenStore tokenStore, JwtAccessTokenConverter tokenConverter) {
		DefaultTokenServices tokenServices = new DefaultTokenServices();

		tokenServices.setTokenStore(tokenStore);
		tokenServices.setSupportRefreshToken(true);
		tokenServices.setTokenEnhancer(tokenConverter);

		return tokenServices;
	}

}
