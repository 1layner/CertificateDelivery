package br.com.certificateDelivery.inscricao;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import br.com.certificateDelivery.UsuarioInscricao.UsuarioInscricaoEntity;
import br.com.certificateDelivery.evento.EventoEntity;
import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_inscricao")
@AttributeOverride(name="id", column=@Column(name="codinscricao"))
public class InscricaoEntity extends BaseEntity<Long> {

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="evento")
	private EventoEntity evento;

	public InscricaoEntity() {
		super();
	}

	public InscricaoEntity(EventoEntity evento) {
		super();
		this.evento = evento;
	}

	public EventoEntity getEvento() {
		return evento;
	}

	public void setEvento(EventoEntity evento) {
		this.evento = evento;
	}
	
//	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinTable(
//			name="tb_usuario_inscricao",
//			joinColumns=@JoinColumn(name="usuariosfk"),
//			inverseJoinColumns=@JoinColumn(name="inscricoesfk")
//	)
//	private List<UsuarioEntity> usuario;
	

}
