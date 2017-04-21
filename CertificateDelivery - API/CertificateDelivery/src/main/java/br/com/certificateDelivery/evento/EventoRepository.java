package br.com.certificateDelivery.evento;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

	//@Query("select e from EventoEntity e where e.usuario=?1")
	public Page<EventoEntity> findByUsuario(Integer id, Pageable requestPage);
	
	public List<EventoEntity> findByUsuario(Integer id);
	
}

