package com.formacionbdi.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Role;
import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Usuario;

@ComponentScan(basePackages={"com.formacionbdi.springboot.app.usuarios.commons.models.entity"})
//@ComponentScan({"com.formacionbdi.springboot.app.usuarios"}) //ACA IBA ENTITYSCAN PERO NO FUNCIONABA
@SpringBootApplication
public class SpringbootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run( SpringbootServicioUsuariosApplication.class, args);
	}

}
