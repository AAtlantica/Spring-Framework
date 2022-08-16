package anotaciones.springframework.service;


import anotaciones.springframework.dto.EmpleadoDTO;

public interface EmpleadoServicio {
    void guadarEmpleado(EmpleadoDTO empleadoDTO);
    void leerBD();
}
