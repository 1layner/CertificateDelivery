/*package br.com.certificateDelivery.teste;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.certificateDelivery.image.ImageEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_teste")
@AttributeOverride(name="id", column=@Column(name="codteste"))
public class TesteEntity extends BaseEntity<Long> {
	
	@Column(name="nometeste", length=240, nullable=true)
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="codimgfk", nullable=true)
	private ImageEntity codimgfk;
	
	public TesteEntity(){
		
	}

	public TesteEntity(String nome, ImageEntity codimgfk) {
		super();
		this.nome = nome;
		this.codimgfk = codimgfk;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ImageEntity getCodimgfk() {
		return codimgfk;
	}

	public void setCodimgfk(ImageEntity codimgfk) {
		this.codimgfk = codimgfk;
	}
}*/
