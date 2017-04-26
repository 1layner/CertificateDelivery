package br.com.certificateDelivery.inscricao;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_inscricao")
@AttributeOverride(name="id", column=@Column(name="cod_inscricao"))
public class InscricaoEntity extends BaseEntity<Long> {
	
	@Column(name="presente", length=1, nullable=false)
	private boolean presente;
	
	@Column(name="datainscricao", nullable=false)
	private Date dataInscricao;
	
	@Column(name="usuario", length=11, nullable=false)
	private int usuario;
	
	@Column(name="evento", length=11, nullable=false)
	private int evento;
	
	public InscricaoEntity(){
		
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getEvento() {
		return evento;
	}

	public void setEvento(int evento) {
		this.evento = evento;
	}
}
