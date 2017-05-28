package br.com.certificateDelivery.dataHora;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.annotation.Timed;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.certificateDelivery.evento.EventoEntity;
import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_data_hora")
@AttributeOverride(name="id", column=@Column(name="coddatahora"))
public class DataHoraEntity extends BaseEntity<Long> {
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="dataevento", nullable=true)
	private Date dataEvento;

	@Column(name="horaevento", nullable=true)
	private Time horaEvento;
	
	@Column(name="duracao", nullable=true)
	private int duracaoEvento;
	
	@JsonIgnore
	@OneToMany(mappedBy="dataHora", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<EventoEntity> evento;
	
	public DataHoraEntity(){
		
	}

	public DataHoraEntity(Date dataEvento, Time horaEvento, int duracaoEvento, List<EventoEntity> evento) {
		super();
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.duracaoEvento = duracaoEvento;
		this.evento = evento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Time getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(Time horaEvento) {
		this.horaEvento = horaEvento;
	}

	public int getDuracaoEvento() {
		return duracaoEvento;
	}

	public void setDuracaoEvento(int duracaoEvento) {
		this.duracaoEvento = duracaoEvento;
	}

	public List<EventoEntity> getEvento() {
		return evento;
	}

	public void setEvento(List<EventoEntity> evento) {
		this.evento = evento;
	}

}
