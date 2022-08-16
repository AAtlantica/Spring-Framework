package xml.springframework.service.impl;

import xml.springframework.dto.EmpleadoDTO;
import xml.springframework.mapper.EmpleadoMapper;
import xml.springframework.repository.EmpleadoRepository;
import xml.springframework.service.EmpleadoEstadisticaServicio;

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
