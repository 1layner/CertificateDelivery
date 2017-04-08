package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.dataHora.DataHoraEntity;
import br.com.certificateDelivery.dataHora.DataHoraRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class DataHoraRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(DataHoraRepositoryTest.class);
	
	@Autowired
	private DataHoraRepository dataHoraRepository;
	
	@Test
	public void listarTudo(){
		List<DataHoraEntity> dataHora = this.dataHoraRepository.findAll();
		LOGGER.info(dataHora + " ");
	}
	
}
