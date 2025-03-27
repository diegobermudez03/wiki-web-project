package com.web_dev.wiki_project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.web_dev.wiki_project.entities.UserStoryEntity;

@Component
public class UserStoriesService {
    
    public List<UserStoryEntity> getArrendStories(){
        List<UserStoryEntity> userStories = new ArrayList<>();

        UserStoryEntity story13 = new UserStoryEntity();
        story13.setId(13L);
        story13.setStoryId("HUA. 13.");
        story13.setName("Creación de cuenta");
        story13.setType("ARRENDADOR");
        story13.setSentence("Como un usuario arrendatario Quiero poder crear una cuenta de un usuario en el sistema que pueda manejar propiedades Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.");
        story13.setCriteria("– Cuando accedo al sistema por primera vez, veo una opción clara para crear una cuenta de usuario.\n– Al hacer clic en “Crear cuenta”, se me redirige a un formulario de registro.\n– En el formulario de registro, debo proporcionar la siguiente información:\nNombres (obligatorio)\nApellidos (obligatorio)\nCorreo electrónico (obligatorio)\nTeléfono\nContraseña\n– El sistema valida que el correo electrónico corporativo sea único y válido.\n– El sistema valida que el correo sea único y cumpla con las políticas de nomenclatura de la empresa.\n– La contraseña debe cumplir con los requisitos de seguridad mínimos, como tener al menos 8 caracteres.\n– Después de enviar el formulario, recibo una confirmación que mi cuenta ha sido creada con éxito y con un enlace que va permitir activar la cuenta.\n– Si ingreso información incorrecta o no válida en el formulario de registro, recibo mensajes de error claros que me indican cómo corregir los problemas.\n– Después de crear la cuenta y acceder al sistema, tengo acceso a las herramientas y recursos necesarios para llevar a cabo mis responsabilidades laborales.");
        userStories.add(story13);

        UserStoryEntity story14 = new UserStoryEntity();
        story14.setId(14L);
        story14.setStoryId("HUA. 14.");
        story14.setName("Activación de cuenta");
        story14.setType("ARRENDADOR");
        story14.setSentence("Como un usuario arrendatario Quiero activar mi cuenta Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.");
        story14.setCriteria("– Cuando me llegue el correo de activación, el usuario podrá hacer click en un enlace y esto activará la cuenta y entrará al inicio de la cuenta para poder realizar sus actividades");
        userStories.add(story14);

        UserStoryEntity story15 = new UserStoryEntity();
        story15.setId(15L);
        story15.setStoryId("HUA. 15.");
        story15.setName("Autenticación");
        story15.setType("ARRENDADOR");
        story15.setSentence("Como un usuario arrendatario Quiero autenticarme en el sistema Para poder acceder de forma segura a mi cuenta");
        story15.setCriteria("– Al ingresar a cualquier página si no está autenticado, el sistema lo llevará a la página de autenticación.\n– Aquí encontrará un formulario con los siguientes campos:\nCorreo\nContraseña\n– Al ingresar el formulario de forma correcta, el sistema lo llevará al inicio de se sesión y en caso que no mostrará el error.");
        userStories.add(story15);

        UserStoryEntity story16 = new UserStoryEntity();
        story16.setId(16L);
        story16.setStoryId("HUA. 16.");
        story16.setName("Creación de cuenta");
        story16.setType("ARRENDADOR");
        story16.setSentence("Como un usuario arrendatario Quiero buscar propiedades Para poder solicitar el arriendo en fechas específicas");
        story16.setCriteria("– El usuario ingresará a un sitio donde se mostrará un listado de propiedades. La lista inicial será de un municipio seleccionado por la herramienta al azar.\n– El usuario podrá realizar la búsqueda de propiedades por las siguientes características:\nNombre\nMunicipio\ncantidad de personas\n– El listado tendrá mínimo las siguientes columnas:\nImagen chiquita descriptiva de la imagen\nNombre\nDepartamento\nMunicipio\nEnlace para ver el detalle de la propiedad");
        userStories.add(story16);

        UserStoryEntity story17 = new UserStoryEntity();
        story17.setId(17L);
        story17.setStoryId("HUA. 17.");
        story17.setName("Solicitar arriendo");
        story17.setType("ARRENDADOR");
        story17.setSentence("Como un usuario arrendatario Quiero autenticarme en el sistema Para realizar el paso de previo para pagar el posible arriendo");
        story17.setCriteria("– Al ingresar al detalle de la propiedad el arrendatario encontrará un botón donde podra solicitar el arriendo:\n– Al hacer click en ese botón, le aparecerá un formulario en el que se deberán llenar los siguientes campos:\nFecha inicial (obligatorio, no puede ser anterior a la fecha actual)\nFecha final (obligatorio, no puede ser anterior a un día posterior a la fecha inicial)\nCantidad de personas (obligatorio y no puede ser superior al que permite la propiedad)\n– Una vez se llena de forma correcta se debe ir al listado de solicitudes que deben estar ordenadas de las más reciente a la mas antigua.\n– En caso que no se llenen de forma correcta, no permitirá seguir mostrará un mensaje notificando por qué no se realizó el ingreso de la información");
        userStories.add(story17);

        UserStoryEntity story18 = new UserStoryEntity();
        story18.setId(18L);
        story18.setStoryId("HUA. 18.");
        story18.setName("Ver solicitudes de arriendo");
        story18.setType("ARRENDADOR");
        story18.setSentence("Como un usuario arrendatario Quiero autenticarme en el sistema Para verificar mis solicitudes de arriendo");
        story18.setCriteria("– En el menú principal los usuario podrán hacer clic y verificar todas las solicitudes de reserva hechas por el usuario.\n– Los datos que se podrán ver en la tabla son:\nNombre de predio\nFecha y hora que se realiza la solicitud\nFecha de llegada\nFecha de salida\nValor\nEstado\n– Cuando esté en estado de pago, deberá aparecer un botón para ir a realizar el pago.\n– Cuando esté en estado de calificación, aparecerá la posibilidad de calificar e insertar un comentario tanto para calificar el predio como para calificar el anfitrión.");
        userStories.add(story18);
        
        UserStoryEntity story19 = new UserStoryEntity();
        story19.setId(19L);
        story19.setStoryId("HUA. 19.");
        story19.setName("Pagar arriendo");
        story19.setType("ARRENDADOR");
        story19.setSentence("Como un usuario arrendatario Quiero autenticarme en el sistema Para pagar los arriendos");
        story19.setCriteria("– En el listado de solicitudes de arriendo cuando la solicitud esté en estado de pago y no esté vencida aparecerá un botón donde se podrá realizar el pago; al hacer clic se abrirá un formulario donde se aparecerá los datos de pago, particularmente:\n– Valor, que lo deberá actualizar automáticamente\n– Banco, se entregará un listado\n– Número de cuenta");
        userStories.add(story19);

        UserStoryEntity story20 = new UserStoryEntity();
        story20.setId(20L);
        story20.setStoryId("HUA.20.");
        story20.setName("Calificar finca");
        story20.setType("ARRENDADOR");
        story20.setSentence("Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios");
        story20.setCriteria("– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.\n– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un comentario.\n– Una vez califica, verifica que el usuario arrendador haya calificado la finca y al arrendatario; en caso que todo este calificado pasa a cerrado, en el caso contrario mantiene el estado.");
        userStories.add(story20);

        UserStoryEntity story21 = new UserStoryEntity();
        story21.setId(21L);
        story21.setStoryId("HUA.21.");
        story21.setName("Calificar arrendatario");
        story21.setType("ARRENDADOR");
        story21.setSentence("Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios");
        story21.setCriteria("– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.\n– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un comentario.\n– Una vez califica, verifica que el usuario arrendador haya calificado la finca y al arrendatario; en caso que todo este calificado pasa a cerrado, en el caso contrario mantiene el estado.");
        userStories.add(story21);

        return userStories;
    }

    public List<UserStoryEntity> getAdminStories(){
        List<UserStoryEntity> userStories = new ArrayList<>();

        UserStoryEntity story1 = new UserStoryEntity();
        story1.setId(1L);
        story1.setStoryId("HUA. 1.");
        story1.setName("Creacion de cuenta");
        story1.setType("ADMINISTRADOR");
        story1.setSentence("Como un usuario arrendador Quiero poder crear una cuenta de un usuario en el sistema que pueda manejar propiedades Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.");
        story1.setCriteria("– Cuando accedo al sistema por primera vez, veo una opción clara para crear una cuenta de usuario.\n– Al hacer clic en “Crear cuenta”, se me redirige a un formulario de registro.\n– En el formulario de registro, debo proporcionar la siguiente información:\nNombres (obligatorio)\nApellidos (obligatorio)\nCorreo electrónico (obligatorio)\nTeléfono\nContraseña\n– El sistema valida que el correo electrónico corporativo sea único y válido.\n– El sistema valida que el correo sea único y cumpla con las políticas de nomenclatura de la empresa.\n– La contraseña debe cumplir con los requisitos de seguridad mínimos, como tener al menos 8 caracteres.\n– Después de enviar el formulario, recibo una confirmación que mi cuenta ha sido creada con éxito y con un enlace que va permitir activar la cuenta.\n– Si ingreso información incorrecta o no válida en el formulario de registro, recibo mensajes de error claros que me indican cómo corregir los problemas.\n– Después de crear la cuenta y acceder al sistema, tengo acceso a las herramientas y recursos necesarios para llevar a cabo mis responsabilidades laborales.");
        userStories.add(story1);

        UserStoryEntity story2 = new UserStoryEntity();
        story2.setId(2L);
        story2.setStoryId("HUA. 2.");
        story2.setName("Activación de cuenta");
        story2.setType("ADMINISTRADOR");
        story2.setSentence("Como un usuario arrendador Quiero activar mi cuenta Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.");
        story2.setCriteria("– Cuando me llegue el correo de activación, el usuario podrá hacer click en un enlace y esto activará la cuenta y entrará al inicio de la cuenta para poder realizar sus actividades");
        userStories.add(story2);

        UserStoryEntity story3 = new UserStoryEntity();
        story3.setId(3L);
        story3.setStoryId("HUA. 3.");
        story3.setName("Autenticación de usuario");
        story3.setType("ADMINISTRADOR");
        story3.setSentence("Como un usuario arrendador Quiero autenticarme en el sistema Para poder acceder de forma segura a mi cuenta");
        story3.setCriteria("– Al ingresar a cualquier página si no está autenticado, el sistema lo llevará a la página de autenticación.\n– Aquí encontrará un formulario con los siguientes campos:\nCorreo\nContraseña\n– Al ingresar el formulario de forma correcta, el sistema lo llevará al inicio de se sesión y en caso que no mostrará el error.");
        userStories.add(story3);

        UserStoryEntity story4 = new UserStoryEntity();
        story4.setId(4L);
        story4.setStoryId("HUA. 4.");
        story4.setName("Ver mis propiedades");
        story4.setType("ADMINISTRADOR");
        story4.setSentence("Como un usuario arrendador Quiero ver las propiedades que tengo a mi cargo Para poder realizar las acciones que el sistema me va permitir");
        story4.setCriteria("– Ingreso a la página y me va mostrar una lista/tabla mínimo con los siguiente datos:\nImagen chiquita descriptiva de la imagen\nNombre\nDepartamento\nMunicipio\nEnlace para editar\nEnlace para ver el detalle");
        userStories.add(story4);

        UserStoryEntity story5 = new UserStoryEntity();
        story5.setId(5L);
        story5.setStoryId("HUA. 5.");
        story5.setName("Crear propiedad");
        story5.setType("ADMINISTRADOR");
        story5.setSentence("Como un usuario arrendador Quiero crear propiedades Para poder arrendar las propiedaes");
        story5.setCriteria("– Ingreso a la página donde puedo ver todas las propiedades\n– Ahí encontramos un botón que va llevar al formulario de crear una propiedad, donde se econtrarán los siguientes datos:\nNombre (obligatorio)\nDepartamento/Municipio (obligatorio, verificar en datos abiertos o DANE los Departamentos/Municipio)\nTipo de ingreso (En el municipio, carretera principal, carretera secundaria y carretera terciaria)\nDescripción (obligatorio)\nCantidad de habitaciones (obligatorio)\nCantidad de baños (obligatorio)\nPermite mascotas (obligatorio)\nTiene piscina (obligatorio)\nTiene asador(obligatorio)\nValor noche\n– El sistema debe verificar los datos, en caso de ser exitoso, una vez ingresada irá a una página donde está la información de la finca; en el caso contrario mostrará en detalle cual es el error");
        userStories.add(story5);

        UserStoryEntity story6 = new UserStoryEntity();
        story6.setId(6L);
        story6.setStoryId("HUA. 6.");
        story6.setName("Editar propiedad");
        story6.setType("ADMINISTRADOR");
        story6.setSentence("Como un usuario arrendador Quiero editar mis propiedades Para poder arrendar las propiedades y actualizar");
        story6.setCriteria("– Ingreso a la página donde puedo ver todas las propiedades\n– Ahí encontramos un botón por cada propiedad que me va permitir ir al formulario donde se pueden actualizar los datos básicos\n– También al ingresar a la propiedad existirá un enlace donde podre ir al formulario donde se pueden actualizar los datos básicos\n– Los datos básicos a editar:\nNombre (obligatorio)\nDepartamento/Municipio (obligatorio, verificar en datos abiertos o DANE los Departamentos/Municipio)\nTipo de ingreso (En el municipio, carretera principal, carretera secundaria y carretera terciaria)\nDescripción (obligatorio)\nCantidad de habitaciones (obligatorio)\nCantidad de baños (obligatorio)\nPermite mascotas (obligatorio)\nTiene piscina (obligatorio)\nTiene asador(obligatorio)\nValor noche\n– El sistema debe verificar los datos, en caso de ser exitoso, una vez ingresada irá a una página donde está la información de la finca; en el caso contrario mostrará en detalle cual es el error");
        userStories.add(story6);

        UserStoryEntity story7 = new UserStoryEntity();
        story7.setId(7L);
        story7.setStoryId("HUA. 7.");
        story7.setName("Subir foto de la propiedad");
        story7.setType("ADMINISTRADOR");
        story7.setSentence("Como un usuario arrendador Quiero subir fotos de las propiedades Para poder arrendar mostrar las propiedades de mejor forma");
        story7.setCriteria("– Ingreso a la página donde puedo ver todas las propiedades\n– Ahí encontramos un botón que va llevar al formulario de crear una propiedad, donde se econtrarán los siguientes datos:\n– En esa página se encontrará un botón que va mostrar el formulario del subir foto\n– Una vez el usuario seleccione la foto y la suba, deberá ir a la página de la propiedad donde podrá ver la información de la propiedad");
        userStories.add(story7);

        UserStoryEntity story8 = new UserStoryEntity();
        story8.setId(8L);
        story8.setStoryId("HUA. 8.");
        story8.setName("Desactivar propiedad");
        story8.setType("ADMINISTRADOR");
        story8.setSentence("Como un usuario arrendador Quiero desactivar propiedades Para que no me arrienden propiedades que ya no tengo en mi disposición");
        story8.setCriteria("– Ingreso a la página donde puedo ver todas las propiedades\n– Ahí encontramos un botón que va llevar mostrar un diálogo de confirmación para desactivar.\n– La propiedad desactivada, si bien no se elimina de la base de datos, no podrá volver a verla.");
        userStories.add(story8);

        UserStoryEntity story9 = new UserStoryEntity();
        story9.setId(9L);
        story9.setStoryId("HUA. 9.");
        story9.setName("Ver solicitudes de arriendo");
        story9.setType("ADMINISTRADOR");
        story9.setSentence("Como un usuario arrendador Quiero ver las solicitudes de arriendo Para poder aceptar o rechazar las solicitudes de arriendo");
        story9.setCriteria("– Ingreso a la página donde puedo ver un listado de solicitudes de arriendo que están activas con los siguientes estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar.\n– También ingresando a la página de la propiedad puedo ver todas las solicitudes de la propiedad con los siguientes estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar, (5) rechazada, (6) finalizada.\n– En los listados se debe ver:\nNombre del solicitante\nFecha y hora que se realiza la solicitud\nFecha de llegada\nFecha de salida\nValor\nEstado\nBotón en caso de estar en ese estado de aceptar y rechazar solicitud");
        userStories.add(story9);

        UserStoryEntity story10 = new UserStoryEntity();
        story10.setId(10L);
        story10.setStoryId("HUA. 10.");
        story10.setName("Aceptar solicitud de arriendo");
        story10.setType("ADMINISTRADOR");
        story10.setSentence("Como un usuario arrendador Quiero aceptar la solicitud de arriendo Para poder aceptar las solicitudes de arriendo");
        story10.setCriteria("– Ingreso a la página donde puedo ver un listado de solicitudes de arriendo que están activas con los siguientes estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar.\n– En los listados de solicitudes el usuario podrá ver el botón de aceptar, este botón solo se habilitará para las solicitudes que están por aceptar.\n– Una vez se acepte pasa a estado por pago");
        userStories.add(story10);

        UserStoryEntity story11 = new UserStoryEntity();
        story11.setId(11L);
        story11.setStoryId("HUA. 11.");
        story11.setName("Cancelar solicitud de arriendo");
        story11.setType("ADMINISTRADOR");
        story11.setSentence("Como un usuario arrendador Quiero cancelar la solicitud de arriendo Para poder cancelar solicitudes de arriendo");
        story11.setCriteria("– En los listados de solicitudes el usuario podrá ver el botón de cancelar, este botón solo se habilitará para las solicitudes que están por aceptar.\n– Una vez se acepte pasa a estado cancelada");
        userStories.add(story11);

        UserStoryEntity story12 = new UserStoryEntity();
        story12.setId(12L);
        story12.setStoryId("HUA. 12.");
        story12.setName("Calificar arrendatario");
        story12.setType("ADMINISTRADOR");
        story12.setSentence("Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios");
        story12.setCriteria("– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.\n– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un");
        userStories.add(story12);

        return userStories;
    }
    
}
