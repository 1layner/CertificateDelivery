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
	
	//Query de listagem de eventos (meus eventos inscritos)
	@Query(value="select e.nome, e.acompanhante, e.codevento, e.caminhouploadcertificado, e.caminhouploadfolder, e.categoria, e.contato, e.corpocertorg, e.corpocertouv, e.corpocertpalest, e.coddatahorafk, e.datalimite, e.linkinscricao, e.local, e.codlogradourofk, e.nomeuploadcertificado, e.nomeuploadfolder, e.observacoes, e.tipoevento, e.usufk from tb_evento e, tb_usuario u, tb_inscricao i, tb_usuario_inscricao ui, tb_data_hora dh where i.codinscricao = ui.inscricoesfk and u.codusuario = ui.usuariosfk and e.codevento = i.evento and dh.coddatahora = e.coddatahorafk and e.usufk = ?1", nativeQuery=true)
	public List<EventoEntity> retornaInscritos(Long id); 
	//public List<EventoEntity> retornaInscritos(Long id);
	//Fazer ela funcionar parte a parte;
	
	//@Procedure(procedureName = "retornaEventosInscritos")
	//List<EventoEntity> retornaEventosInscritos(Long id);
}

