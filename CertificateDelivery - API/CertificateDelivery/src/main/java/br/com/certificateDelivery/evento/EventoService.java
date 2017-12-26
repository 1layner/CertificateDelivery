package br.com.certificateDelivery.evento;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.lang.model.element.PackageElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.EVENTO_PATH)
public class EventoService extends GenericService<EventoEntity, Long> {
	
	private Path rootDir;
	
	@Autowired
	private EventoRepository eventoRepository;
	
//	//servico de meus eventos
//	@RequestMapping(value="/{id}", method=RequestMethod.GET)
//	public List<EventoEntity> sortEvento(
//			@PathVariable Long id){
//	
//		return this.eventoRepository.findByUsuarioId(id);
//	}
	
	//servico de meus eventos
		@RequestMapping(value="/retornaMeusEventos", method=RequestMethod.GET)
		public List<EventoEntity> sortEvento(){
			Object usuarioLogado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String username;
			
			if(usuarioLogado instanceof UserDetails){
				username = ((UserDetails)usuarioLogado).getUsername();
			}
			else{
				username=usuarioLogado.toString();
			}
			
			return this.eventoRepository.findByUsuarioEvento(username);
		}
	
	//servico de meus eventos paginado
	@RequestMapping(value="/{id}/{page}/{size}", method=RequestMethod.GET)
	public Page<EventoEntity> sortLista(
			@PathVariable Integer id,
			@PathVariable Integer page,
			@PathVariable Integer size){
	
//		if((id != null) && (page!=null) && (size!=null)){
			PageRequest requestPage = new PageRequest(page, size);
			
			return this.eventoRepository.findByUsuarioId(id, requestPage);
//		}
		
//		return this.eventoRepository.findAll();
	}
	
	//servico meus eventos inscritos
	// tem que voltar esse servico
	@RequestMapping(value="/listaInscritos", method=RequestMethod.GET)
	public List<EventoEntity> listaEventosInscritos(){
		Object usuarioLogado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		
		if(usuarioLogado instanceof UserDetails){
			username = ((UserDetails)usuarioLogado).getUsername();
		}
		else{
			username=usuarioLogado.toString();
		}
		
		//return this.eventoRepository.retornaInscritos(username);
		return this.eventoRepository.eventosInscritos(username);
	}
	
	/*@Autowired
	public EventoService(EventoRepository eventoRepository){
		//this.eventoRepository = eventoRepository;
		this.rootDir = Paths.get("/CertificateDelivery/CertificateDelivery - Web/app/imgCert");
	}*/

}
