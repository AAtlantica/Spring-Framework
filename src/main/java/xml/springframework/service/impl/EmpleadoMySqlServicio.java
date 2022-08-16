package xml.springframework.service.impl;

import xml.springframework.dto.EmpleadoDTO;
import xml.springframework.service.EmpleadoServicio;

public class EmpleadoMySqlServicio implements EmpleadoServicio {

    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        System.out.println("Guarde en MySql");
    }

    @Override
    public void leerBD() {
        System.out.println("Estoy leyende desde MySql");

    }
}
