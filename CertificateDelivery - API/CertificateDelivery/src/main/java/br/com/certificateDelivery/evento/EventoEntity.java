package br.com.certificateDelivery.evento;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_evento")
@AttributeOverride(name="id", column=@Column(name="cod_evento"))
public class EventoEntity extends BaseEntity<Long> {
	
	@Column(name="nome", length=255, nullable=true)
	private String nome;
	
	@Column(name="local", length=255, nullable=true)
	private String local;
	
	@Column(name="contato", length=9, nullable=true)
	private int contato;
	
	@Column(name="categoria", length=255, nullable=true)
	private String categoria;
	
	@Column(name="acompanhante", length=1, nullable=true)
	private boolean acompanhante;
	
	@Column(name="nome_upload_certificado", length=255, nullable=true)
	private String nomeUploadCertificado;
	
	@Column(name="caminho_upload_certificado", length=255, nullable=true)
	private String caminhoCertificado;
	
	@Column(name="nome_upload_folder", length=255, nullable=true)
	private String nomeUploadFolder;
	
	@Column(name="caminho_upload_folder", length=255, nullable=true)
	private String caminhoFolder;
}
