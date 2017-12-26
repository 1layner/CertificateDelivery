package br.com.certificateDelivery.UsuarioInscricao;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.AttributeAccessor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.certificateDelivery.inscricao.InscricaoEntity;
import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_usuario_inscricao")
public class UsuarioInscricaoEntity extends BaseEntity<UsuarioInscricaoKey> {
	
	@Column(name="presente", nullable=true)
	private boolean presente;
	
	@Column(name="nomeInsc", length=255, nullable=true)
	private String nomeInsc;
	
	@Column(name="telefoneInsc", length=8, nullable=true)
	private int telefoneInsc;
	
	@Column(name="emailInsc", length=255, nullable=true)
	private String emailInsc;
	
	public UsuarioInscricaoEntity(){
		
	}

	public UsuarioInscricaoEntity(boolean presente, String nomeInsc, int telefoneInsc, String emailInsc) {
		super();
		this.presente = presente;
		this.nomeInsc = nomeInsc;
		this.telefoneInsc = telefoneInsc;
		this.emailInsc = emailInsc;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public String getNomeInsc() {
		return nomeInsc;
	}

	public void setNomeInsc(String nomeInsc) {
		this.nomeInsc = nomeInsc;
	}

	public int getTelefoneInsc() {
		return telefoneInsc;
	}

	public void setTelefoneInsc(int telefoneInsc) {
		this.telefoneInsc = telefoneInsc;
	}

	public String getEmailInsc() {
		return emailInsc;
	}

	public void setEmailInsc(String emailInsc) {
		this.emailInsc = emailInsc;
	}

	
}
