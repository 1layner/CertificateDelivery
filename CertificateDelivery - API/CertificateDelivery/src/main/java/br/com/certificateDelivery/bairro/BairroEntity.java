/*package br.com.certificateDelivery.bairro;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_bairro")
@AttributeOverride(name="id", column=@Column(name="cod_bairro"))
public class BairroEntity extends BaseEntity<Long> {
	
	@Column(name="nomeBairro", length=255, nullable=false)
	private String nomeBairro;
	
	public BairroEntity(){
		
	}

	public BairroEntity(String nomeBairro) {
		super();
		this.nomeBairro = nomeBairro;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
}*/
