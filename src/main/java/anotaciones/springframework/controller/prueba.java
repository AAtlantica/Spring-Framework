package anotaciones.springframework.controller;


import anotaciones.springframework.dto.EmpleadoDTO;
import anotaciones.springframework.mapper.EmpleadoMapper;
import anotaciones.springframework.repository.EmpleadoRepository;
import anotaciones.springframework.service.EmpleadoServicio;
import anotaciones.springframework.service.impl.EmpleadoServicioImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class prueba {
    //private static final EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //private static final EmpleadoRepository empleadoRepository = new EmpleadoRepository();

    //Aplicando Inyección de Dependencia


    public static void main(String[] args) {

        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombre("Mauricio");
        empleadoDTO.setApellido("Lopez");
        EmpleadoServicio empleadoServicio = null; 
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            empleadoServicio = (EmpleadoServicio) applicationContext.getBean("empleadoServicioImpl");
        }catch (Exception e){
            System.out.println(e);
        }
        /* Paso 1: CONFIGURAR EL CONTEXTO */
        //EmpleadoServicio empleadoServicio = new EmpleadoServicioImpl(empleadoMapper, empleadoRepository);


        guardarEmpleado(empleadoServicio, empleadoDTO);
        leerBD(empleadoServicio);

    }

    public static  void guardarEmpleado(EmpleadoServicio empleadoServicio, EmpleadoDTO empleadoDTO){
        empleadoServicio.guadarEmpleado(empleadoDTO);
    }

    public static void leerBD(EmpleadoServicio empleadoServicio){
        empleadoServicio.leerBD();
    }
}
