package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.evento.EventoEntity;
import br.com.certificateDelivery.evento.EventoRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class EventoRepositoryTest {
	
	private static final Logger LOGGER = Logger.getLogger(EventoRepositoryTest.class);
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Test
	public void listarTudo(){
		List<EventoEntity> evento = this.eventoRepository.findAll();
		LOGGER.info(evento + " ");
	}
	
	@Test
	public void retornaUm(){
		EventoEntity evento = this.eventoRepository.findOne(1L);
		
		LOGGER.info(evento);
	}
	
	
	/*@Test
	public void retornaEvento(){
		List<EventoEntity> eventos = this.eventoRepository.retornaInscritos(1L);
		
		LOGGER.info(eventos);
	}*/
	
	/*@Test
	public void testBuscar() {
		List<EventoEntity> evento = this.eventoRepository.findByUsuarioNome(1L);
		
		/*if(evento != null){
			System.out.println(evento);
		}
		else{
			System.out.println("null");
		}
		
		
		
		LOGGER.info(evento);
	}*/

}
