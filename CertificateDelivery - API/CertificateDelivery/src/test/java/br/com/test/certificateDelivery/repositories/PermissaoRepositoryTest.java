package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.permissao.PermissaoEntity;
import br.com.certificateDelivery.permissao.PermissaoRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class PermissaoRepositoryTest {
	
	private static final Logger LOGGER = Logger.getLogger(PermissaoRepositoryTest.class);
	
	@Autowired
	private PermissaoRepository permissaoRepository;
	
	@Test
	public void listaTodos(){
		List<PermissaoEntity> perm = this.permissaoRepository.findAll();
		LOGGER.info(perm + "");
	}

}
