package xml.springframework.service;


import xml.springframework.dto.EmpleadoDTO;

public interface EmpleadoServicio {
    void guadarEmpleado(EmpleadoDTO empleadoDTO);
    void leerBD();
}
