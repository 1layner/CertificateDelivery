package br.com.certificateDelivery.estado;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_estado")
@AttributeOverride(name="id", column=@Column(name="cod_estado"))
public class EstadoEntity extends BaseEntity<Long> {
	
	@Column(name="siglaEstado", length=2, nullable=false)
	private char siglaEstado;
	
	public EstadoEntity(){
		
	}

	public EstadoEntity(char siglaEstado) {
		super();
		this.siglaEstado = siglaEstado;
	}

	public char getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(char siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
}