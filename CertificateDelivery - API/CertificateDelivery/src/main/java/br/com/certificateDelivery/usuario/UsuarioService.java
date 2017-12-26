package br.com.certificateDelivery.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.permissao.PermissaoRepository;
import br.com.certificateDelivery.security.CurrentUser;
import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<UsuarioEntity, Long> {
	
	@Autowired
	private PermissaoRepository permissaoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private UsuarioEntity usuario;
	
	// CADASTRA NOVO USUÁRIO
	
	@JsonCreator
	@JsonIgnore
	@Override
	public UsuarioEntity insercao(@RequestBody UsuarioEntity entityObject) {
		if (entityObject.getPermissao() != null) {
			for (int i = 0; i < entityObject.getPermissao().size(); i++) {
				Long id = entityObject.getPermissao().get(i).getId();
				
				entityObject.getPermissao().set(i, permissaoRepository.findOne(id));
			}
		}
		
		return super.insercao(entityObject);
	}
	
	/*public UsuarioService(){
		usuario = new UsuarioEntity();
		SecurityContext context = SecurityContextHolder.getContext();
		if(context instanceof SecurityContext){
			Authentication authentication = context.getAuthentication();
			if(authentication instanceof Authentication){
				usuario.setNome(((UsuarioEntity)authentication.getPrincipal()).getNome());
			}
		}
		
	}*/
	
	@RequestMapping(value="/configuracoes", method=RequestMethod.GET)
	public UsuarioEntity listaUnico(){
		Object usuarioLogado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		
		if(usuarioLogado instanceof UserDetails){
			username = ((UserDetails)usuarioLogado).getUsername();
		}
		else{
			username=usuarioLogado.toString();
		}
		
		return this.usuarioRepository.findByAll(username);
	}
}
