/*package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.estado.EstadoEntity;
import br.com.certificateDelivery.estado.EstadoRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class EstadoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(EstadoRepositoryTest.class);
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Test
	public void listarTudo(){
		List<EstadoEntity> est = this.estadoRepository.findAll();
		LOGGER.info(est + "");
	}
	
}*/
