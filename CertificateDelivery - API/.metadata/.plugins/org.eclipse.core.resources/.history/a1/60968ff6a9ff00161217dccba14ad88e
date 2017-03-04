package br.com.certificateDelivery.usuarioPermissao;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.certificateDelivery.utils.BaseKey;

@Embeddable
public class UsuarioPermissaoKey extends BaseKey {
	
	private static final long serialVersionUID = 201602010536L;
	
	@Column(name="fk_usuario", length=11, nullable=false)
	private Long fk_usuario;
	
	@Column(name="fk_permissao", length=11, nullable=false)
	private Long fk_permissao;
	
	public UsuarioPermissaoKey(){
		
	}

	public UsuarioPermissaoKey(Long fk_usuario, Long fk_permissao) {
		super();
		this.fk_usuario = fk_usuario;
		this.fk_permissao = fk_permissao;
	}

	public Long getFk_usuario() {
		return fk_usuario;
	}

	public void setFk_usuario(Long fk_usuario) {
		this.fk_usuario = fk_usuario;
	}

	public Long getFk_permissao() {
		return fk_permissao;
	}

	public void setFk_permissao(Long fk_permissao) {
		this.fk_permissao = fk_permissao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
