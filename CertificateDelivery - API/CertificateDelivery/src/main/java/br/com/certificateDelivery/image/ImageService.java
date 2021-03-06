package br.com.certificateDelivery.image;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.GenericService;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.IMAGE_PATH)
public class ImageService extends GenericService<ImageEntity, Long> {

}
