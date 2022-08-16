package anotaciones.springframework.service.impl;

import anotaciones.springframework.dto.EmpleadoDTO;
import anotaciones.springframework.mapper.EmpleadoMapper;
import anotaciones.springframework.repository.EmpleadoRepository;
import anotaciones.springframework.service.EmpleadoEstadisticaServicio;

public class EmpleadoServicioEstadistica extends EmpleadoServicioImpl implements EmpleadoEstadisticaServicio {
    private int numeroEmpleadosGuardados = 0;

    public EmpleadoServicioEstadistica(EmpleadoMapper empleadoMapper, EmpleadoRepository empleadoRepository) {
        super(empleadoMapper, empleadoRepository);
    }


    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        super.guadarEmpleado(empleadoDTO);
        numeroEmpleadosGuardados++;
    }

    @Override
    public void obtenerEstadistica() {

        numeroEmpleadosGuardados ++;
    }
}
