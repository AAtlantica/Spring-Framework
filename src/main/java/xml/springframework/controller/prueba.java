package xml.springframework.controller;


import xml.springframework.dto.EmpleadoDTO;
import xml.springframework.service.EmpleadoServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class prueba {
    //private static final EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //private static final EmpleadoRepository empleadoRepository = new EmpleadoRepository();

    //Aplicando Inyección de Dependencia


    public static void main(String[] args) {

        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombre("Mauricio");
        empleadoDTO.setApellido("Lopez");

        /* Paso 1: CONFIGURAR EL CONTEXTO y ACCEDER A LA LECTURA DEL ARCHIVO XML*/
        ApplicationContext context = new ClassPathXmlApplicationContext("configuracion.xml");
        //EmpleadoMapper empleadoMapper1 = (EmpleadoMapper) context.getBean("empleadoMapper");
        //EmpleadoRepository empleadoRepository1 = (EmpleadoRepository) context.getBean("empleadoRepository");
        EmpleadoServicio empleadoServicio = (EmpleadoServicio) context.getBean("empleadoServicioImpl");


        guardarEmpleado(empleadoServicio, empleadoDTO);

        /* Paso 2: VERIFICAR QUE EL OBJETO SE CREA UNA SOLA VEZ */
        //EmpleadoMapper empleadoMapper2 = (EmpleadoMapper) context.getBean("empleadoMapper");
        //EmpleadoRepository empleadoRepository2 = (EmpleadoRepository) context.getBean("empleadoRepository");
        EmpleadoServicio empleadoServicio1 = (EmpleadoServicio) context.getBean("empleadoServicioImpl");


        /* Paso 3: GUARDAR EN LA bd */
        guardarEmpleado(empleadoServicio1, empleadoDTO);

        /* Paso 4: LEER LA BD */
        leerBD(empleadoServicio);

    }

    public static  void guardarEmpleado(EmpleadoServicio empleadoServicio, EmpleadoDTO empleadoDTO){
        empleadoServicio.guadarEmpleado(empleadoDTO);
    }

    public static void leerBD(EmpleadoServicio empleadoServicio){
        empleadoServicio.leerBD();
    }
}
