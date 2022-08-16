package anotaciones.springframework.service.impl;


import anotaciones.springframework.dto.EmpleadoDTO;
import anotaciones.springframework.entities.EmpleadoEntity;
import anotaciones.springframework.mapper.EmpleadoMapper;
import anotaciones.springframework.repository.EmpleadoRepository;
import anotaciones.springframework.service.EmpleadoServicio;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    private final EmpleadoMapper empleadoMapper;
    private final EmpleadoRepository empleadoRepository;
    public EmpleadoServicioImpl(EmpleadoMapper empleadoMapper,
                                EmpleadoRepository empleadoRepository){
        this.empleadoMapper = empleadoMapper;
        this.empleadoRepository = empleadoRepository;

        System.out.println("todavia no soy de spring framewok! jajajaj");
    }

    //EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //EmpleadoRepository empleadoRepository = new EmpleadoRepository();


    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
      EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
      empleadoRepository.guardarEmpleadoEntity(empleadoEntity);
     }

    @Override
    public void leerBD() {
        empleadoRepository.leerBD();
    }

}
