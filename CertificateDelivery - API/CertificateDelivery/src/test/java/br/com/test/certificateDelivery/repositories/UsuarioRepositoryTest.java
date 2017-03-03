package br.com.test.certificateDelivery.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.usuario.UsuarioEntity;
import br.com.certificateDelivery.usuario.UsuarioRepository;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class UsuarioRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(UsuarioRepositoryTest.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void listarTudo(){
		List<UsuarioEntity> user = this.usuarioRepository.findAll();
		LOGGER.info(user + " ");
	}
	
}