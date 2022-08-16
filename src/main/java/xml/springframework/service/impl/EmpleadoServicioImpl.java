package xml.springframework.service.impl;


import org.springframework.stereotype.Service;
import xml.springframework.dto.EmpleadoDTO;
import xml.springframework.entities.EmpleadoEntity;
import xml.springframework.mapper.EmpleadoMapper;
import xml.springframework.repository.EmpleadoRepository;
import xml.springframework.service.EmpleadoServicio;
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
