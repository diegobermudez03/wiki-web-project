CREATE TABLE IF NOT EXISTS endpoints(
    id      SERIAL PRIMARY KEY,
    route   TEXT NOT NULL,
    method  TEXT NOT NULL CHECK(method IN ('GET', 'POST', 'PUT', 'DELETE', 'PATCH')),
    description     TEXT NOT NULL
);

INSERT INTO endpoints(route, method, description) VALUES
('/api/v1/finca', 'POST', 'Endpoint para subir finca, solo administrador'),
('/api/v1/fincas', 'GET', 'Endpoint para obtener fincas, para todos los usuarios'),
('/api/v1/{userId}/fincas/', 'GET', 'Endpoint para obtener fincas de un arrendatario en especifico'),
('/api/v1/fincas/{fincaId}/solicitudes', 'POST', 'Endpoint para que el arrendador envie una solicitud sobre una finca'),
('/api/v1/fincas/{fincaId}', 'DELETE', 'Eendpoint para que el administrador de la ficna la elimine'),
('/api/v1/fincas/{fincaId}', 'PATCH', 'Endpoint para modificar informacion de la finca');