package br.com.certificateDelivery.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.certificateDelivery.permissao.PermissaoEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
}
