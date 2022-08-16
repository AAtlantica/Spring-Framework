package xml.springframework.repository;

import xml.springframework.entities.EmpleadoEntity;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {

    public EmpleadoRepository(){
        System.out.println("Soy el constructor de Empleado Repository");
    }
    List<EmpleadoEntity> empleadoEntities = new ArrayList<>();

    public void  guardarEmpleadoEntity(EmpleadoEntity empleadoEntity){

        empleadoEntities.add(empleadoEntity);
    }

    public void leerBD(){
        for(EmpleadoEntity empleado : this.empleadoEntities){
            System.out.println(empleado);
        }
    }
}
