package br.com.certificateDelivery.image;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_img_certificado")
@AttributeOverride(name="id", column=@Column(name="codimgcertificado"))
public class ImageEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID=1L;
	
	private int filesize;
	private String filetype;
	private String filename;
	@Column(columnDefinition="LONGBLOB")
	private byte[] base64;
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getBase64() {
		return base64;
	}
	public void setBase64(byte[] base64) {
		this.base64 = base64;
	}
}
