package br.com.certificateDelivery.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.permissao.PermissaoEntity;
import br.com.certificateDelivery.usuario.UsuarioEntity;


public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {

	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	protected JpaRepository<T, ID> genericRepository;
	
	@RequestMapping(value="/listaTodos", method=RequestMethod.GET)
	public List<T> findByAll(){
		return this.genericRepository.findAll();
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public T insercao(@RequestBody T entityObject){
		if(entityObject.getId()!=null){
			System.out.println("Erro!! O metodo chamado nao realiza update em tabelas.");
		}
		return this.genericRepository.save(entityObject);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public T update(@RequestBody T entityObject){
		if(entityObject.getId()==null){
			System.out.println("Erro!! O metodo chamado nao realiza insercao em tabelas.");
		}
		return this.genericRepository.save(entityObject);
	}
	
	@RequestMapping(value="/listaUnico/{id}", method=RequestMethod.GET)
	public T listaUnico(@PathVariable ID id){
		//System.out.println("XXX");
		return this.genericRepository.findOne(id);
	}
	
	@RequestMapping(value="/{page}/{size}", method=RequestMethod.GET)
	public List<T> sortLista(
			@PathVariable Integer page,
			@PathVariable Integer size){
		
		if((page!=null) && (size!=null)){
			PageRequest requestPage = new PageRequest(page, size, new Sort(Direction.DESC, "id"));
			
			return this.genericRepository.findAll(requestPage).getContent();
		}
		
		return this.genericRepository.findAll(new Sort(Direction.DESC, "id"));
	}
} 