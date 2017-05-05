package br.com.certificateDelivery.permissao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name = "tb_permissao")
@AttributeOverride(name = "id", column = @Column(name = "codpermissao"))
public class PermissaoEntity extends BaseEntity<Long> {

	@Column(name = "permissao", length = 255, nullable = false)
	private String permissao;

	public PermissaoEntity() {

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