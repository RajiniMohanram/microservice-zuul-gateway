package com.srt.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulGatewayApplication.class, args);
	}

	@Bean
	public ZuulFilter preFilter() {
		return new SimplePreFilter();
	}
}
