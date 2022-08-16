package anotaciones.springframework.mapper;

import anotaciones.springframework.dto.EmpleadoDTO;
import anotaciones.springframework.entities.EmpleadoEntity;
import org.springframework.stereotype.Component;


public class EmpleadoMapper {

    public EmpleadoMapper(){
        System.out.println("Estoy ejecutando empleado mapper");
    }
    public EmpleadoEntity toEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(empleadoDTO.getNombre());
        empleadoEntity.setApellido(empleadoDTO.getApellido());
        return  empleadoEntity;
    }
}
