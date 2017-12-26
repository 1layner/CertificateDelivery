package br.com.certificateDelivery.UsuarioInscricao;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.certificateDelivery.utils.BaseKey;

@Embeddable
public class UsuarioInscricaoKey extends BaseKey {

	@Column(name="usuariosfk", length=11, nullable=false)
	private Long usuariosfk;
	
	@Column(name="inscricoesfk", length=11, nullable=false)
	private Long inscricoesfk;
	
	public UsuarioInscricaoKey(){
		
	}

	public UsuarioInscricaoKey(Long usuariosfk, Long inscricoesfk) {
		super();
		this.usuariosfk = usuariosfk;
		this.inscricoesfk = inscricoesfk;
	}

	public Long getUsuariosfk() {
		return usuariosfk;
	}

	public void setUsuariosfk(Long usuariosfk) {
		this.usuariosfk = usuariosfk;
	}

	public Long getInscricoesfk() {
		return inscricoesfk;
	}

	public void setInscricoesfk(Long inscricoesfk) {
		this.inscricoesfk = inscricoesfk;
	}
}
