/*package br.com.certificateDelivery.estado;

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
	
	@Column(name="siglaEstado", length=2, nullable=false)
	private char siglaEstado;
	
	//@OneToMany(mappedBy="cidade", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CidadeEntity> cidade;
	
	public EstadoEntity(){
		
	}

	public EstadoEntity(char siglaEstado, List<CidadeEntity> cidade) {
		super();
		this.siglaEstado = siglaEstado;
		this.cidade = cidade;
	}

	public char getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(char siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public List<CidadeEntity> getCidade() {
		return cidade;
	}

	public void setCidade(List<CidadeEntity> cidade) {
		this.cidade = cidade;
	}
}*/
