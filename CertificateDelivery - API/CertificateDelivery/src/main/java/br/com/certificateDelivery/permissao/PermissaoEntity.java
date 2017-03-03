package br.com.certificateDelivery.permissao;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_permissao")
@AttributeOverride(name="id", column=@Column(name="cod_Permissao"))
public class PermissaoEntity extends BaseEntity<Long> {
	
	@Column(name="permissao", length=255, nullable=false)
	private String permissao;
	
	public PermissaoEntity(){
		
	}

	public PermissaoEntity(String permissao) {
		super();
		this.permissao = permissao;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
}
