CREATE TABLE IF NOT EXISTS endpoints(
    id      SERIAL PRIMARY KEY,
    route   TEXT NOT NULL,
    method  TEXT NOT NULL CHECK(method IN ('GET', 'POST', 'PUT', 'DELETE', 'PATCH')),
    role    TEXT NOT NULL,
    auth    BOOLEAN NOT NULL,
    description     TEXT NOT NULL
);

INSERT INTO endpoints(route, method, description, role, auth) VALUES
('/api/v1/auth/acounts', 'POST', 'Crea cuenta de ADMIN o ARRENDADOR, el rol esta definido en el payload', 'LANDLORD/USER', FALSE),
('/api/v1/auth/acounts/activate', 'POST', 'Confirma la creacion de la cuenta con el token recibido por correo', 'LANDLORD/USER', FALSE),
('/api/v1/auth/sessions', 'POST', 'crea una nueva sesion para la cuenta, es un login', 'LANDLORD/USER', FALSE),
('/api/v1/auth/refresh', 'POST', 'Obtiene un nuevo access token para la sesion', 'LANDLORD/USER', TRUE),
('/api/v1/properties/departments', 'GET', 'Obtiene los departamentos disponibles permitidos', 'LANDLORD/USER', TRUE),
('/api/v1/properties/{finca_id}/pictures', 'POST', 'Publica una nueva foto a la finca en cuestion', 'LANDLORD', TRUE),
('/api/v1/files/properties', 'POST', 'Publica una nueva finca', 'LANDLORD', TRUE),
('/api/v1/files/properties/{property_id}', 'GET', 'Obtiene la finca completa', 'LANDLORD/USER', TRUE),
('/api/v1/properties/{property_id}', 'PUT', 'Actualiza la informacion de la finca del landlord', 'LANDLORD', TRUE),
('/api/v1/properties/{property_id}', 'DELETE', 'Elimina la finca del landlord registrado', 'LANDLORD', TRUE),
('/api/v1/properties?page=1&name=string&department=string&nRooms=1&nPeople=1&minPrice=1&maxPrice=1', 'GET', 'Obtiene las fincas con base a los filtros establecidos', 'LANDLORD/USER', TRUE),
('/api/v1/properties/mine?page=1', 'GET', 'Obtiene las fincas del landlord registrado', 'LANDLORD', TRUE),
('/api/v1/rental/properties/{property_id}/requests', 'POST', 'Envia una nueva request de estadia en la finca', 'USER', TRUE),
('/api/v1/rental/properties/{property_id}/schedules?month=7&year=2024', 'POST', 'Retorna las programaciones de la finca para no colisionar', 'USER', TRUE),
('/api/v1/rental/requests?page=1', 'GET', 'Retorna las requests realizadas por el usuario', 'USER', TRUE),
('/api/v1/rental/owner/requests?page=1', 'GET', 'Retorna las requests asociadas a las fincas del landlord', 'LANDLORD', TRUE),
('/api/v1/rental/{rental_request_id}/accept', 'PATCH', 'Acepta una solicitud de arrendacion', 'LANDLORD', TRUE),
('/api/v1/rental/{rental_request_id}/deny', 'PATCH', 'Rechaza una solicitud de arrendacion', 'LANDLORD', TRUE),
('/api/v1/rental/requests/{request_id}/ratings', 'POST', 'Agrega el rating respecto a un request, si es LANDLORD es al user, si es USER es al LANDLORD y la finca', 'LANDLORD/USER', TRUE),
('/api/v1/payments/banks', 'GET', 'Obtiene todos los bancos validos para pago', 'USER', TRUE),
('/api/v1/payments/requests/{request_id}/payments', 'POST', 'Realiza un pago asociado a una reserva', 'USER', TRUE),
('/api/v1/files/properties/{finca_id}/{img_name}', 'GET', 'Obtiene la foto de la finca', 'USER/LANDLORD', FALSE);