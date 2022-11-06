package com.PDW.ProyectoDW.repositories;

import com.PDW.ProyectoDW.entities.Configuraciones;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConfiguracionesRepository extends PagingAndSortingRepository<Configuraciones, Long>{	

}
