package br.com.certificateDelivery.estado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServiceMap;
import br.com.certificateDelivery.utils.ServicePath;
import br.com.test.certificateDelivery.utils.AppContextTest;

@RestController
@RequestMapping(path=ServicePath.ESTADO_PATH)
public class EstadoService extends GenericService<EstadoEntity, Long> {
	
}
