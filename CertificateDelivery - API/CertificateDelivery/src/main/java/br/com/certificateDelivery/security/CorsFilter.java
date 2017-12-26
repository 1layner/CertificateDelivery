//package br.com.certificateDelivery.security;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletResponse;
//import javax.xml.ws.spi.http.HttpContext;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.GenericFilterBean;
//
//@Component
//public class CorsFilter extends GenericFilterBean {
//		
//	@Override
//	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
//			throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");
//		response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept");
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Max-Age", "180");
//		
//		filterChain.doFilter(servletRequest, servletResponse);
//	}
//}
