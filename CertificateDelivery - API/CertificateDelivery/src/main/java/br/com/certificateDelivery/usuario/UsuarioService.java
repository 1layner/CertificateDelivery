package br.com.certificateDelivery.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<UsuarioEntity, Long> {

}
