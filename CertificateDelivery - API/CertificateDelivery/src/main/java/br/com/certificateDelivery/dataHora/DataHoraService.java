package br.com.certificateDelivery.dataHora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.DATA_HORA_EVENTO)
public class DataHoraService extends GenericService<DataHoraEntity, Long> {

}
