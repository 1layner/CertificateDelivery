package br.com.certificateDelivery.evento;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

	//Query de listagem paginada de eventos (meus eventos)
	//@Query("select e from EventoEntity e where e.usuario=?1")
	public Page<EventoEntity> findByUsuarioId(Integer id, Pageable requestPage);
	
	//Query de listagem de eventos (meus eventos)
	public List<EventoEntity> findByUsuarioId(Long id);
	
	@Query(value="select  e.nome, u.codusuario, u.nome, u.email, u.senha, e.codevento, e.local, e.contato, e.categoria, e.acompanhante, e.tipoEvento, e.observacoes, e.dataLimite, e.corpocertouv, e.corpocertorg, e.corpocertpalest, e.linkinscricao, e.codlogradourofk, e.usufk, e.dtacriacao, e.coddatahorafk, e.codimgfk, e.liberacao  from tb_evento e, tb_usuario u where u.codusuario = e.usufk and u.nome like %?1%", nativeQuery=true)
	public List<EventoEntity> findByUsuarioEvento(String nome);
	
	
	//
	//Query de listagem de eventos (meus eventos inscritos)
	//Tem que voltar essa query
	@Query(value="select e.nome, e.acompanhante, e.codevento,  e.categoria, e.contato, e.corpocertorg, e.corpocertouv, e.corpocertpalest, e.coddatahorafk, e.datalimite, e.linkinscricao, e.local, e.codlogradourofk, e.observacoes, e.tipoevento, e.usufk from tb_evento e, tb_usuario u, tb_inscricao i, tb_usuario_inscricao ui, tb_data_hora dh where i.codinscricao = ui.inscricoesfk and u.codusuario = ui.usuariosfk and e.codevento = i.evento and dh.coddatahora = e.coddatahorafk and e.usufk = ?1", nativeQuery=true)
	public List<EventoEntity> retornaInscritos(Long id); 
	//public List<EventoEntity> retornaInscritos(Long id);
	//Fazer ela funcionar parte a parte;
	
	//tem que voltar essa query
	@Query(value="select e.nome, u.codusuario, u.nome, u.email, u.senha, e.codevento, e.local, e.contato, e.categoria, e.acompanhante, e.tipoEvento, e.observacoes, e.dataLimite, e.corpocertouv, e.corpocertorg, e.corpocertpalest, e.linkinscricao, e.codlogradourofk, e.usufk, e.dtacriacao, e.coddatahorafk, e.codimgfk, e.liberacao, i.codinscricao, i.evento, ui.usuariosfk, ui.inscricoesfk, ui.presente, ui.dtaInscricao, ui.nomeInsc, ui.telefoneInsc, ui.emailInsc from tb_usuario u, tb_evento e, tb_inscricao i, tb_usuario_inscricao ui where i.codinscricao = ui.inscricoesfk and e.codevento = i.evento and u.nome like %?1%", nativeQuery=true)
	public List<EventoEntity> eventosInscritos(String nome);
	

}

