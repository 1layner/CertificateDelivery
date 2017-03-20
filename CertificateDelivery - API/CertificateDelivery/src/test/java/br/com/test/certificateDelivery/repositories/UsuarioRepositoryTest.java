package br.com.test.certificateDelivery.repositories;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.certificateDelivery.permissao.PermissaoEntity;
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
		System.out.println("Usuário com Permissoes" + user.toString());
		LOGGER.info(user + " ");
	}
	
	@Test
	public void addUsu(){
		PermissaoEntity per1 = new PermissaoEntity();
		per1.setPermissao("organizador");
		
		PermissaoEntity per2 = new PermissaoEntity();
		per2.setPermissao("ouvinte");
		
		UsuarioEntity usu = new UsuarioEntity();
		usu.setNome("Jair");
		usu.setEmail("ja@gmail.com");
		usu.setSenha("1234");
		usu.setPermissao((List<PermissaoEntity>) Arrays.asList(per1, per2));
		
		usuarioRepository.save(usu);
		
		LOGGER.info(usu + "");
	}
	
}
