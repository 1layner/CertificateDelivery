package br.com.certificateDelivery.security;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.certificateDelivery.utils.ServiceMap;
import br.com.certificateDelivery.utils.ServicePath;

@RestController
@RequestMapping(ServicePath.LOGIN_PATH)
public class SecurityService implements ServiceMap {
	
	@RequestMapping(method = { RequestMethod.GET })
	public Principal usuario(Principal usuario){
		return usuario;
	}
}
