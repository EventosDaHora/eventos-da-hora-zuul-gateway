package br.com.eventosdahora.eventosdahorazuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EventosDaHoraZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventosDaHoraZuulGatewayApplication.class, args);
	}

}
