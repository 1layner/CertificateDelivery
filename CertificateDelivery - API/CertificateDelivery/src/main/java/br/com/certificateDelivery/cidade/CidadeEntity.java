/*package br.com.certificateDelivery.cidade;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_cidade")
@AttributeOverride(name="id", column=@Column(name="cod_cidade"))
public class CidadeEntity extends BaseEntity<Long> {
	
	@Column(name="nomeCidade", length=255, nullable=false)
	private String nomeCidade;
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="cidade")
	private int codEstado;
	
	
	public CidadeEntity(){
		
	}

	public CidadeEntity(String nomeCidade, int codEstado) {
		super();
		this.nomeCidade = nomeCidade;
		this.codEstado = codEstado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public int getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(int codEstado) {
		this.codEstado = codEstado;
	}
}*/
