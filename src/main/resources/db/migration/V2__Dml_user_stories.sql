INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 1.', 
    'Creacion de cuenta', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero poder crear una cuenta de un usuario en el sistema que pueda manejar propiedades Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.',
    '– Cuando accedo al sistema por primera vez, veo una opción clara para crear una cuenta de usuario.
– Al hacer clic en “Crear cuenta”, se me redirige a un formulario de registro.
– En el formulario de registro, debo proporcionar la siguiente información:
Nombres (obligatorio)
Apellidos (obligatorio)
Correo electrónico (obligatorio)
Teléfono
Contraseña
– El sistema valida que el correo electrónico corporativo sea único y válido.
– El sistema valida que el correo sea único y cumpla con las políticas de nomenclatura de la empresa.
– La contraseña debe cumplir con los requisitos de seguridad mínimos, como tener al menos 8 caracteres.
– Después de enviar el formulario, recibo una confirmación que mi cuenta ha sido creada con éxito y con un enlace que va permitir activar la cuenta.
– Si ingreso información incorrecta o no válida en el formulario de registro, recibo mensajes de error claros que me indican cómo corregir los problemas.
– Después de crear la cuenta y acceder al sistema, tengo acceso a las herramientas y recursos necesarios para llevar a cabo mis responsabilidades laborales.'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 2.', 
    'Activación de cuenta', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero activar mi cuenta Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.',
    '– Cuando me llegue el correo de activación, el usuario podrá hacer click en un enlace y esto activará la cuenta y entrará al inicio de la cuenta para poder realizar sus actividades'
);

INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 3.', 
    'Autenticación de usuario', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero autenticarme en el sistema Para poder acceder de forma segura a mi cuenta',
    '– Al ingresar a cualquier página si no está autenticado, el sistema lo llevará a la página de autenticación.
– Aquí encontrará un formulario con los siguientes campos:
Correo
Contraseña
Al ingresar el formulario de forma correcta, el sistema lo llevará al inicio de se sesión y en caso que no mostrará el error.'
);

INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 4.', 
    'Ver mis propiedades', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero ver las propiedades que tengo a mi cargo Para poder realizar las acciones que el sistema me va permitir',
    '– Ingreso a la página y me va mostrar una lista/tabla mínimo con los siguiente datos:
Imagen chiquita descriptiva de la imagen
Nombre
Departamento
Municipio
Enlace para editar
Enlace para ver el detalle'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 5.', 
    'Crear propiedad', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero crear propiedades Para poder arrendar las propiedaes',
    '– Ingreso a la página donde puedo ver todas las propiedades
– Ahí encontramos un botón que va llevar al formulario de crear una propiedad, donde se econtrarán los siguientes datos:
Nombre (obligatorio)
Departamento/Municipio (obligatorio, verificar en datos abiertos o DANE los Departamentos/Municipio)
Tipo de ingreso (En el municipio, carretera principal, carretera secundaria y carretera terciaria)
Descripción (obligatorio)
Cantidad de habitaciones (obligatorio)
Cantidad de baños (obligatorio)
Permite mascotas (obligatorio)
Tiene piscina (obligatorio)
Tiene asador(obligatorio)
Valor noche
– El sistema debe verificar los datos, en caso de ser exitoso, una vez ingresada irá a una página donde está la información de la finca; en el caso contrario mostrará en detalle cual es el error'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 6.', 
    'Editar propiedad', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero editar mis propiedades Para poder arrendar las propiedades y actualizar',
    '– Ingreso a la página donde puedo ver todas las propiedades
– Ahí encontramos un botón por cada propiedad que me va permitir ir al formulario donde se pueden actualizar los datos básicos
– También al ingresar a la propiedad existirá un enlace donde podre ir al formulario donde se pueden actualizar los datos básicos
– Los datos básicos a editar:
Nombre (obligatorio)
Departamento/Municipio (obligatorio, verificar en datos abiertos o DANE los Departamentos/Municipio)
Tipo de ingreso (En el municipio, carretera principal, carretera secundaria y carretera terciaria)
Descripción (obligatorio)
Cantidad de habitaciones (obligatorio)
Cantidad de baños (obligatorio)
Permite mascotas (obligatorio)
Tiene piscina (obligatorio)
Tiene asador(obligatorio)
Valor noche
– El sistema debe verificar los datos, en caso de ser exitoso, una vez ingresada irá a una página donde está la información de la finca; en el caso contrario mostrará en detalle cual es el error'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 7.', 
    'Subir foto de la propiedad', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero subir fotos de las propiedades Para poder arrendar mostrar las propiedades de mejor forma',
    '– Ingreso a la página donde puedo ver todas las propiedades
– Ahí encontramos un botón que va llevar al formulario de crear una propiedad, donde se econtrarán los siguientes datos:
– En esa página se encontrará un botón que va mostrar el formulario del subir foto
– Una vez el usuario selecciones la foto y la suba, deberá ir a la página de la propiedad donde podrá var la información de la propiedad'
);



INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 8.', 
    'Desactivar propiedad', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero desactivar propiedades Para que no me arrienden propiedades que ya no tengo en mi disposición',
    '– Ingreso a la página donde puedo ver todas las propiedades
– Ahí encontramos un botón que va llevar mostrar un diálogo de confirmación para desactivar.
– La propiedad desactivada, si bien no se elimina de la base de datos, no podrá volver a verla.'
);



INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 9.', 
    'Ver solicitudes de arriendo', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero ver las solicitudes de arriendo Para poder aceptar o rechazar las solicitudes de arriendo',
    '– Ingreso a la página donde puedo ver un listado de solicitudes de arriendo que están activas con los siguientes estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar.
– También ingresando a la página de la propiedad puedo ver todas las solicitudes de la propiedad con los siguiente estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar, (5) rechazada, (6) finalizada.
– En los listados se debe ver:
Nombre del solicitante
Fecha y hora que se realiza la solicitud
Fecha de llegada
Fecha de salida
Valor
Estado
Botón en caso de estar en ese estado de aceptar y rechazar solicitud'
);



INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 10.', 
    'Aceptar solicitud de arriendo', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero aceptar la solicitud de arriendo Para poder aceptar las solicitudes de arriendo',
    '– Ingreso a la página donde puedo ver un listado de solicitudes de arriendo que están activas con los siguientes estados: (1) por aceptar, (2) aceptada, (3) pagada, (4) por calificar.
– – En los listados de solicitudes el usuario podrá ver el botón de aceptar, este botón solo se habilitará para las solicitudes que están por aceptar.
– Una vez se acepte pasa a estado por pago'
);

INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 11.', 
    'Cancelar solicitud de arriendo', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero cancelar la solicitud de arriendo Para poder cancelar solicitudes de arriendo',
    '– En los listados de solicitudes el usuario podrá ver el botón de cancelar, este botón solo se habilitará para las solicitudes que están por aceptar.
– Una vez se acepte pasa a estado cancelada'
);

INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 12.', 
    'Calificar arrendatario', 
    'ADMINISTRADOR',
    'Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios',
    '– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.
– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 13.', 
    'Creación de cuenta', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero poder crear una cuenta de un usuario en el sistema que pueda manejar propiedades Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.',
    '– Cuando accedo al sistema por primera vez, veo una opción clara para crear una cuenta de usuario.
– Al hacer clic en “Crear cuenta”, se me redirige a un formulario de registro.
– En el formulario de registro, debo proporcionar la siguiente información:
Nombres (obligatorio)
Apellidos (obligatorio)
Correo electrónico (obligatorio)
Teléfono
Contraseña
– El sistema valida que el correo electrónico corporativo sea único y válido.
– El sistema valida que el correo sea único y cumpla con las políticas de nomenclatura de la empresa.
– La contraseña debe cumplir con los requisitos de seguridad mínimos, como tener al menos 8 caracteres.
– Después de enviar el formulario, recibo una confirmación que mi cuenta ha sido creada con éxito y con un enlace que va permitir activar la cuenta.
– Si ingreso información incorrecta o no válida en el formulario de registro, recibo mensajes de error claros que me indican cómo corregir los problemas.
– Después de crear la cuenta y acceder al sistema, tengo acceso a las herramientas y recursos necesarios para llevar a cabo mis responsabilidades laborales.'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 14.', 
    'Activación de cuenta', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero activar mi cuenta Para que pueda acceder a las herramientas y recursos necesarios para realizar las actividades del sistema.',
    '– Cuando me llegue el correo de activación, el usuario podrá hacer click en un enlace y esto activará la cuenta y entrará al inicio de la cuenta para poder realizar sus actividades'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 15.', 
    'Autenticación', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero autenticarme en el sistema Para poder acceder de forma segura a mi cuenta',
    '– Al ingresar a cualquier página si no está autenticado, el sistema lo llevará a la página de autenticación.
– Aquí encontrará un formulario con los siguientes campos:
Correo
Contraseña
Al ingresar el formulario de forma correcta, el sistema lo llevará al inicio de se sesión y en caso que no mostrará el error.'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 16.', 
    'Creación de cuenta', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero buscar propiedades Para poder solicitar el arriendo en fechas específicas',
    '– El usuario ingresará a un sitio donde se mostrará un listado de propiedades. La lista inicial será de un municipio seleccionado por la herramienta al azar.
– El usuario podrá realizar la búsqueda de propiedades por las siguientes características:
Nombre
Municipio
cantidad de personas
– El listado tendrá mínimo las siguientes columnas:
Imagen chiquita descriptiva de la imagen
Nombre
Departamento
Municipio
Enlace para ver el detalle de la propiedad'
);



INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 17.', 
    'Solicitar arriendo', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero autenticarme en el sistema Para realizar el paso de previo para pagar el posible arriendo',
    '– Al ingresar al detalle de la propiedad el arrendatario encontrará un botón donde podra solicitar el arriendo:
– Al hacer click en ese botón, le aparecerá un formulario en el que se deberán llenar los siguientes campos:
Fecha inicial (obligatorio, no puede ser anterior a la fecha actual)
Fecha final (obligatorio, no puede ser anterior a un día posterior a la fecha inicial)
Cantidad de personas (obligatorio y no puede ser superior al que permite la propiedad)
– Una vez se llena de forma correcta se debe ir al listado de solicitudes que deben estar ordenadas de las más reciente a la mas antigua.
– En caso que no se llenen de forma correcta, no permitirá seguir mostrará un mensaje notificando por qué no se realizó el ingreso de la información'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 18.', 
    'Ver solicitudes de arriendo', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero autenticarme en el sistema Para verificar mis solicitudes de arriendo',
    '– En el menú principal los usuario podrán hacer clic y verificar todas las solicitudes de reserva hechas por el usuario.
– Los datos que se podrán ver en la tabla son:
Nombre de predio
Fecha y hora que se realiza la solicitud
Fecha de llegada
Fecha de salida
Valor
Estado
– Cuando esté en estado de pago, deberá aparecer un botón para ir a realizar el pago.
– Cuando esté en estado de calificación, aparecerá la posibilidad de calificar e insertar un comentario tanto para calificar el predio como para calificar el anfitrión.'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA. 19.', 
    'Pagar arriendo', 
    'ARRENDADOR',
    'Como un usuario arrendatario Quiero autenticarme en el sistema Para pagar los arriendos',
    '– En el listado de solicitudes de arriendo cuando la solicitud esté en estado de pago y no esté vencida aparecerá un botón donde se podrá realizar el pago; al hacer clic se abrirá un formulario donde se aparecerá los datos de pago, particularmente:
– Valor, que lo deberá actualizar automáticamente
– Banco, se entregará un listado
– Número de cuenta'
);


INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA.20.', 
    'Calificar finca', 
    'ARRENDADOR',
    'Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios',
    '– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.
– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un comentario.
– Una vez califica, verifica que el usuario arrendador haya calificado la finca y al arrendatario; en caso que todo este calificado pasa a cerrado, en el caso contrario mantiene el estado.'
);

INSERT INTO user_stories(story_id, name, type, sentence, criteria)
VALUES(
    'HUA.21.', 
    'Calificar arrendatario', 
    'ARRENDADOR',
    'Como un usuario arrendador Quiero calificar el arrendatario Para poder mostrar cerrar y verificar que tan buenos son los arrendatarios',
    '– El usuario verá la lista del solicitudes solo en caso de estar por calificar y ya se haya pasado la fecha de entrega, le aparecerá el botón de calificar.
– Al hacer click ahí lo lleva al formulario de calificar donde también se pedirá un comentario.
– Una vez califica, verifica que el usuario arrendador haya calificado la finca y al arrendatario; en caso que todo este calificado pasa a cerrado, en el caso contrario mantiene el estado.'
);