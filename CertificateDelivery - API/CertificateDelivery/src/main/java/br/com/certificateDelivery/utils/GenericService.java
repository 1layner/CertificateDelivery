package br.com.certificateDelivery.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
		return this.genericRepository.save(entityObject);
	}
	
	@RequestMapping(value="/listaUnico/{id}", method=RequestMethod.GET)
	public T listaUnico(@PathVariable Long id){
		return this.genericRepository.findOne((ID) id);
	}
}
