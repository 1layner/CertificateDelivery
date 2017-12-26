package br.com.certificateDelivery.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.certificateDelivery.utils.ServicePath;

@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	public static final String AUTH_ORGANIZADOR = "ROLE_ORGANIZADOR";
	
	public static final String AUTH_PALESTRANTE = "ROLE_PALESTRANTE";
	
	public static final String AUTH_OUVINTE = "ROLE_OUVINTE";
	
	@Autowired
	private UserDetailsService userService;
	
	@Autowired
	private HeaderHandler headerHandler;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService);
	}
	
	public void configure(HttpSecurity http) throws Exception{
		
		http.httpBasic().and().authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		// PERMIT ALL
		.antMatchers(ServicePath.PUBLIC_ROOT_PATH, "/**").permitAll()

		// PERMIT AUTHORITIES
		//.antMatchers(ServicePath.USUARIO_PATH).hasAnyAuthority(AUTH_ORGANIZADOR, AUTH_OUVINTE, AUTH_PALESTRANTE)
		//.antMatchers(ServicePath.EVENTO_PATH + "/meusEventos").hasAnyAuthority(AUTH_ORGANIZADOR)
		.antMatchers(HttpMethod.POST, ServicePath.USUARIO_PATH).permitAll()
		.antMatchers(HttpMethod.POST, ServicePath.USUARIO_PATH).permitAll()
		.antMatchers(HttpMethod.GET, ServicePath.PERMISSAO_PATH).permitAll()
		.antMatchers(HttpMethod.GET, ServicePath.EVENTO_PATH).permitAll()
		.antMatchers(HttpMethod.POST, ServicePath.EVENTO_PATH).permitAll()

		.anyRequest().fullyAuthenticated().and()
		// LOGOUT
		
		.logout().logoutRequestMatcher(new AntPathRequestMatcher(ServicePath.LOGOUT_PATH)).logoutSuccessHandler(headerHandler).and()
		// CSRF
		
		.csrf().disable();

	}
	
}
