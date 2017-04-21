package br.com.certificateDelivery.evento;

import java.util.List;

import javax.lang.model.element.PackageElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.EVENTO_PATH)
public class EventoService extends GenericService<EventoEntity, Long> {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public List<EventoEntity> sortEvento(
			@PathVariable Integer id){
	
		return this.eventoRepository.findByUsuario(id);
	}
	
	@RequestMapping(value="/{id}/{page}/{size}", method=RequestMethod.GET)
	public Page<EventoEntity> sortLista(
			@PathVariable Integer id,
			@PathVariable Integer page,
			@PathVariable Integer size){
	
//		if((id != null) && (page!=null) && (size!=null)){
			PageRequest requestPage = new PageRequest(page, size);
			
			return this.eventoRepository.findByUsuario(id, requestPage);
//		}
		
//		return this.eventoRepository.findAll();
	}
}