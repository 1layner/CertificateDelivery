package br.com.certificateDelivery.inscricao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.evento.EventoEntity;
import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.INSCRICAO_PATH)
public class InscricaoService extends GenericService<InscricaoEntity, Long> {

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
//	@RequestMapping(value="/listaInscritos", method=RequestMethod.GET)
//	public List<EventoEntity> listaEventosInscritos(){
//		Object usuarioLogado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		String username;
//		
//		if(usuarioLogado instanceof UserDetails){
//			username = ((UserDetails)usuarioLogado).getUsername();
//		}
//		else{
//			username=usuarioLogado.toString();
//		}
//		
//		//return this.eventoRepository.retornaInscritos(username);
//		return this.inscricaoRepository.eventosInscritos(username);
//	}
	
}
