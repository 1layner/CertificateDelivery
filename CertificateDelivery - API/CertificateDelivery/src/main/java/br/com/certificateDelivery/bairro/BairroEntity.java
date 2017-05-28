package br.com.certificateDelivery.bairro;

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

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.cidade.CidadeEntity;
import br.com.certificateDelivery.logradouro.LogradouroEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_bairro")
@AttributeOverride(name="id", column=@Column(name="codbairro"))
public class BairroEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;

	@Column(name="nomebairro", length=255, nullable=true)
	private String nomeBairro;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codcidadefk")
	private CidadeEntity cidade;
	
	@JsonIgnore
	@OneToMany(mappedBy="bairro", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<LogradouroEntity> logradouro;
	
	public BairroEntity(){
		
	}

	public BairroEntity(String nomeBairro, int cidade) {
		super();
		this.nomeBairro = nomeBairro;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public CidadeEntity getCidade() {
		return cidade;
	}

	public void setCidade(CidadeEntity cidade) {
		this.cidade = cidade;
	}

	public List<LogradouroEntity> getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(List<LogradouroEntity> logradouro) {
		this.logradouro = logradouro;
	}

}
