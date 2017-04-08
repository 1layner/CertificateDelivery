package br.com.certificateDelivery.estado;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.certificateDelivery.cidade.CidadeEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_estado")
@AttributeOverride(name="id", column=@Column(name="cod_estado"))
public class EstadoEntity extends BaseEntity<Long> {
	
	@Column(name="siglaestado", length=2, nullable=false)
	private String siglaEstado;

	
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

}
