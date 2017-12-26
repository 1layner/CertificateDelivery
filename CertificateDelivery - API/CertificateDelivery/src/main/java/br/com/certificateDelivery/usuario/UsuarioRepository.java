package br.com.certificateDelivery.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.certificateDelivery.permissao.PermissaoEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	public UsuarioEntity findByEmail(String email);
	
	@Query(value="select u.codusuario, u.nome, u.email, u.senha from tb_usuario u where u.nome like %?1%", nativeQuery=true)
	public UsuarioEntity findByAll(String nome);
}
