package com.formacionbdi.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/*
 * Con entity scan no funciona, 
 * con ComponentScan solo me toma usuarios y roles pero sin sus ids
 * 
*/

//@ComponentScan(basePackages={"com.formacionbdi.springboot.app.usuarios.commons.models.entity"})
@EntityScan({"com.formacionbdi.springboot.app.usuarios.commons.models.entity"})

@SpringBootApplication
public class SpringbootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run( SpringbootServicioUsuariosApplication.class, args);
	}

}
