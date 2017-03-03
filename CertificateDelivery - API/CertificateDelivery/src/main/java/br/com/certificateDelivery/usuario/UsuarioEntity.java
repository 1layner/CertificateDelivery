package br.com.certificateDelivery.usuario;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.certificateDelivery.permissao.PermissaoEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_usuario")
@AttributeOverride(name="id", column=@Column(name="cod_usuario"))
public class UsuarioEntity extends BaseEntity<Long> {

	@Column(name="nome", length=255, nullable=false)
	private String nome;
	
	@Column(name="email", length=255, nullable=false, unique=true)
	private String email;
	
	@Column(name="senha", length=8, nullable=false, unique=true)
	private String senha;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
			name="tb_usuario_permissao",
			joinColumns=@JoinColumn(name="fk_usuario"),
			inverseJoinColumns=@JoinColumn(name="fk_permissao")
	)
	private List<PermissaoEntity> permissao;
	
	public UsuarioEntity(){
		
	}

	public UsuarioEntity(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}