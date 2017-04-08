package br.com.certificateDelivery.evento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.EVENTO_PATH)
public class EventoService extends GenericService<EventoEntity, Long> {

}
