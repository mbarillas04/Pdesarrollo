package com.PDW.ProyectoDW.repositories;

import com.PDW.ProyectoDW.entities.Usuario;
//import com.ProyectoDesarrolloWeb.spring.app.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
