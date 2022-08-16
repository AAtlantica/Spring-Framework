package anotaciones.springframework.controller;

import anotaciones.springframework.mapper.EmpleadoMapper;
import anotaciones.springframework.repository.EmpleadoRepository;
import anotaciones.springframework.service.impl.EmpleadoServicioImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public EmpleadoMapper empleadoMapper(){
        return new EmpleadoMapper();
    }

    @Bean
    public EmpleadoRepository empleadoRepository(){
        return new EmpleadoRepository();
    }

    @Bean
    public EmpleadoServicioImpl empleadoServicioImpl(){
        return new EmpleadoServicioImpl(empleadoMapper(), empleadoRepository());
    }

}
