package br.com.certificateDelivery.bairro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.BAIRRO_PATH)
public class BairroService extends GenericService<BairroEntity, Long> {

}
