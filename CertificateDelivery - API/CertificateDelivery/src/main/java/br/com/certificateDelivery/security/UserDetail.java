package br.com.certificateDelivery.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.certificateDelivery.permissao.PermissaoEntity;
import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.usuario.UsuarioRepository;

@Component
public class UserDetail implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
		UsuarioEntity usuario = this.usuarioRepository.findByEmail(email);
		
		if(usuario==null){
			throw new UsernameNotFoundException("User with email \"" + email + "\" was not found");
		}
		
		LoginDetailBean login = new LoginDetailBean(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
		
		for(PermissaoEntity permissao : usuario.getPermissao()){
			login.addRole(permissao.getPermissao());
		}
		
		return login;
	}
	
}
