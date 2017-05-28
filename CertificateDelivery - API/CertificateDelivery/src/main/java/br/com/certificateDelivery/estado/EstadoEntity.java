package br.com.certificateDelivery.estado;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.cidade.CidadeEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_estado")
@AttributeOverride(name="id", column=@Column(name="codestado"))
public class EstadoEntity extends BaseEntity<Long> {
	
	@Column(name="siglaestado", length=2, nullable=true)
	private String siglaEstado;

	@JsonIgnore
	@OneToMany(mappedBy="estado", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CidadeEntity> cidade;
	
	public EstadoEntity(){
		
	}

	public EstadoEntity(String siglaEstado) {
		super();
		this.siglaEstado = siglaEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public List<CidadeEntity> getCidade() {
		return cidade;
	}

	public void setCidade(List<CidadeEntity> cidade) {
		this.cidade = cidade;
	}
}
