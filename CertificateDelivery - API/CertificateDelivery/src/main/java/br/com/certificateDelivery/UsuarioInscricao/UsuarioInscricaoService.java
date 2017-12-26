package br.com.certificateDelivery.UsuarioInscricao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.USUARIO_INSCRICAO_PATH)
public class UsuarioInscricaoService extends GenericService<UsuarioInscricaoEntity, UsuarioInscricaoKey> {

}
