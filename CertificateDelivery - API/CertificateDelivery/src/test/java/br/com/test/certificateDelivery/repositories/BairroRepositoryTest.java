package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.bairro.BairroEntity;
import br.com.certificateDelivery.bairro.BairroRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class BairroRepositoryTest {
	
	private static final Logger LOGGER = Logger.getLogger(BairroRepositoryTest.class);
	
	@Autowired
	private BairroRepository bairroRepository;
	
	@Test
	public void listarTudo(){
		List<BairroEntity> bairro = this.bairroRepository.findAll();
		LOGGER.info(bairro + " ");
	}
	

}
