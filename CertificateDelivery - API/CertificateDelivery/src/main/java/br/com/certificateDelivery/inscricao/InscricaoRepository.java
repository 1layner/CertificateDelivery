package br.com.certificateDelivery.inscricao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.certificateDelivery.evento.EventoEntity;

public interface InscricaoRepository extends JpaRepository<InscricaoEntity, Long> {

//	@Query(value="select ui.nomeInsc, ui.telefoneInsc, ui.emailInsc, u.codusuario, u.email, u.senha, e.codevento, e.nome, e.local, e.contato, e.categoria, e.acompanhante, e.tipoEvento, e.observacoes, e.dataLimite, e.corpocertouv, e.corpocertorg, e.corpocertpalest, e.linkinscricao, e.codlogradourofk, e.usufk, e.dtacriacao, e.coddatahorafk, e.codimgfk, e.liberacao, i.codinscricao, i.evento, ui.usuariosfk, ui.inscricoesfk, ui.presente, ui.dtaInscricao from tb_usuario u, tb_evento e, tb_inscricao i, tb_usuario_inscricao ui where i.codinscricao = ui.inscricoesfk and e.codevento = i.evento and u.nome like %?1%", nativeQuery=true)
//	public List<EventoEntity> eventosInscritos(String nome);
}
