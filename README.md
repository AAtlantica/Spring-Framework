# Spring-Framework

## Configuracion

- [Mvn Spring Boot](https://mvnrepository.com/)
- Buscamos la dependencia org.springframework
- Seleccionamos Spring Context
- Verificamos cuál es el de mayor uso actualmente en la columna Usages
- Copiamos la dependencia
- Pegamos en el archivo pom.xml de nuestro proyecto

## Usos

- [Spring Boot](https://spring.io/)
- Menu: Project -> Spring Framework
- Learn -> 5.3.22 -> Reference Doc.
- Core  -> 1.2.1. Configuration Metadata
    - Creamos un archivo tipo xml
    - Nos valemos del xml de configuración que posee la documentación y lo usamos en nuestro archivo de tipo xml.

```xml  
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">  
        <!-- collaborators and configuration for this bean go here -->
    </bean>
</beans>
```
Observaciones:
- El  id = " ",   solicitante en la configuración corresponde al nombre que lleva nuestro objeto al momento de instanciarla
- El class = " ", solicitante corresponde al paquete donde se encuentra alojada nuestra clase instanciada. 


