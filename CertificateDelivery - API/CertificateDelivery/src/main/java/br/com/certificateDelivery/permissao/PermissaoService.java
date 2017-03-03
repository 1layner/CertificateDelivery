package br.com.certificateDelivery.permissao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.PERMISSAO_PATH)
public class PermissaoService extends GenericService<PermissaoEntity, Long> {

}
