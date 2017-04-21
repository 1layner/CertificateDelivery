package br.com.certificateDelivery.cidade;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.bairro.BairroEntity;
import br.com.certificateDelivery.estado.EstadoEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_cidade")
@AttributeOverride(name="id", column=@Column(name="cod_cidade"))
public class CidadeEntity extends BaseEntity<Long> {
	
	@Column(name="nomecidade", length=255, nullable=true)
	private String nomeCidade;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codestado_fk")
	private EstadoEntity estado;
	
	@JsonIgnore
	@OneToMany(mappedBy="cidade", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<BairroEntity> bairro;
	
	public CidadeEntity(){
		
	}

	public CidadeEntity(String nomeCidade, EstadoEntity estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public EstadoEntity getCodEstado() {
		return estado;
	}

	public void setCodEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public List<BairroEntity> getBairro() {
		return bairro;
	}

	public void setBairro(List<BairroEntity> bairro) {
		this.bairro = bairro;
	}

}
