package br.com.certificateDelivery.teste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.TESTE_PATH)
public class TesteService extends GenericService<TesteEntity, Long> {

}
