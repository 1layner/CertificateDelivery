package br.com.test.certificateDelivery.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import br.com.certificateDelivery.utils.AppContext;
@Configuration
@Import(value={AppContext.class})
@ComponentScan(basePackages={"br.com.test.certificateDelivery"})
public class AppContextTest {

}
