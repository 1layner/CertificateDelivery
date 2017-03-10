/*package br.com.certificateDelivery.logradouro;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_logradouro")
@AttributeOverride(name="id", column=@Column(name="cod_logradouro"))
public class LogradouroEntity extends BaseEntity<Long> {

	@Column(name="tipoLogradouro", length=45, nullable=false)
	private String tipoLogradouro;
	
	@Column(name="nomeLogradouro", length=255, nullable=false)
	private String nomeLogradouro;
	
	@Column(name="num_cep", length=11, nullable=false)
	private int numCep;
	
	public LogradouroEntity(){
		
	}

	public LogradouroEntity(String tipoLogradouro, String nomeLogradouro, int numCep) {
		super();
		this.tipoLogradouro = tipoLogradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.numCep = numCep;
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
}*/