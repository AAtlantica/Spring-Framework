package xml.springframework.mapper;

import xml.springframework.dto.EmpleadoDTO;
import xml.springframework.entities.EmpleadoEntity;

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
