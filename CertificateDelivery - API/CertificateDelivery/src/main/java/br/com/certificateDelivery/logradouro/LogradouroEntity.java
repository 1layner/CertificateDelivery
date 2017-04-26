package br.com.certificateDelivery.logradouro;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.bairro.BairroEntity;
import br.com.certificateDelivery.evento.EventoEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_logradouro")
@AttributeOverride(name="id", column=@Column(name="cod_logradouro"))
public class LogradouroEntity extends BaseEntity<Long> {

	@Column(name="tipologradouro", length=45, nullable=false)
	private String tipoLogradouro;
	
	@Column(name="nomelogradouro", length=255, nullable=false)
	private String nomeLogradouro;
	
	@Column(name="num_cep", length=11, nullable=false)
	private int numCep;
	
	@Column(name="numero", length=11, nullable=false)
	private int numero;
	
	//@Column(name="codbairro_fk", length=11, nullable=false)
	//private int bairro;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codbairro_fk")
	private BairroEntity bairro;
	
	@JsonIgnore
	@OneToMany(mappedBy="logradouro", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<EventoEntity> evento;
	
	public LogradouroEntity(){
		
	}

	public LogradouroEntity(String tipoLogradouro, String nomeLogradouro, int numCep, BairroEntity bairro, List<EventoEntity> evento, int numero) {
		super();
		this.tipoLogradouro = tipoLogradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.numCep = numCep;
		this.bairro = bairro;
		this.evento = evento;
		this.numero = numero;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public int getNumCep() {
		return numCep;
	}

	public void setNumCep(int numCep) {
		this.numCep = numCep;
	}

	public BairroEntity getBairro() {
		return bairro;
	}

	public void setBairro(BairroEntity bairro) {
		this.bairro = bairro;
	}

	public List<EventoEntity> getEvento() {
		return evento;
	}

	public void setEvento(List<EventoEntity> evento) {
		this.evento = evento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
