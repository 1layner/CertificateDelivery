package br.com.certificateDelivery.permissao;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name = "tb_permissao")
@AttributeOverride(name = "id", column = @Column(name = "cod_permissao"))
public class PermissaoEntity extends BaseEntity<Long> {

	@Column(name = "permissao", length = 255, nullable = false)
	private String permissao;

	@JsonIgnore
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "tb_usuario_permissao", joinColumns = @JoinColumn(name = "fk_permissao"), inverseJoinColumns = @JoinColumn(name = "fk_usuario"))
	private List<UsuarioEntity> usuario;

	public PermissaoEntity() {

	}

	public PermissaoEntity(String permissao, List<UsuarioEntity> usuario) {
		super();
		this.permissao = permissao;
		this.usuario = usuario;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public List<UsuarioEntity> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<UsuarioEntity> usuario) {
		this.usuario = usuario;
	}
}