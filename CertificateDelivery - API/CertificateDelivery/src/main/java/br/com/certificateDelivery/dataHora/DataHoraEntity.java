package br.com.certificateDelivery.dataHora;

import java.sql.Time;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.certificateDelivery.utils.BaseEntity;

@Entity
@Table(name="tb_data_hora")
@AttributeOverride(name="id", column=@Column(name="cod_datahora"))
public class DataHoraEntity extends BaseEntity<Long> {
	
	@Column(name="data_evento", nullable=false)
	private Date dataEvento;
	
	@Column(name="hora_evento", nullable=false)
	private Time horaEvento;
	
	@Column(name="duracao_evento", nullable=false)
	private int duracaoEvento;
	
	public DataHoraEntity(){
		
	}

	public DataHoraEntity(Date dataEvento, Time horaEvento, int duracaoEvento) {
		super();
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.duracaoEvento = duracaoEvento;
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
}
