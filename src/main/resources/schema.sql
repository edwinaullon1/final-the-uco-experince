CREATE TABLE dbo.uco_evento (
    id UNIQUEIDENTIFIER NOT NULL,
    codigo_publico NVARCHAR(20) NOT NULL,
    nombre NVARCHAR(150) NOT NULL,
    descripcion NVARCHAR(500) NULL,
    fecha_evento DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fin TIME NOT NULL,
    fecha_inicio_inscripcion DATE NOT NULL,
    fecha_fin_inscripcion DATE NOT NULL,
    cupos_maximos INT NOT NULL,
    cupos_disponibles INT NOT NULL,
    valor_inscripcion DECIMAL(12,2) NOT NULL,
    modalidad NVARCHAR(30) NOT NULL,
    ubicacion NVARCHAR(150) NOT NULL,
    estado NVARCHAR(20) NOT NULL,
    CONSTRAINT pk_uco_evento PRIMARY KEY (id),
    CONSTRAINT uq_uco_evento_codigo UNIQUE (codigo_publico)
);

CREATE TABLE dbo.uco_asistente (
    id UNIQUEIDENTIFIER NOT NULL,
    tipo_documento NVARCHAR(20) NOT NULL,
    numero_documento NVARCHAR(30) NOT NULL,
    nombre NVARCHAR(100) NOT NULL,
    apellido NVARCHAR(100) NOT NULL,
    correo_electronico NVARCHAR(150) NOT NULL,
    telefono NVARCHAR(20) NULL,
    estado BIT NOT NULL,
    CONSTRAINT pk_uco_asistente PRIMARY KEY (id),
    CONSTRAINT uq_uco_asistente_documento UNIQUE (numero_documento),
    CONSTRAINT uq_uco_asistente_correo UNIQUE (correo_electronico)
);

CREATE TABLE dbo.uco_inscripcion (
    id UNIQUEIDENTIFIER NOT NULL,
    evento_id UNIQUEIDENTIFIER NOT NULL,
    asistente_id UNIQUEIDENTIFIER NOT NULL,
    fecha_inscripcion DATETIME2 NOT NULL,
    valor_pagado DECIMAL(12,2) NOT NULL,
    estado NVARCHAR(20) NOT NULL,
    mensaje_resultado NVARCHAR(300) NOT NULL,
    CONSTRAINT pk_uco_inscripcion PRIMARY KEY (id),
    CONSTRAINT fk_uco_inscripcion_evento
        FOREIGN KEY (evento_id) REFERENCES dbo.uco_evento (id),
    CONSTRAINT fk_uco_inscripcion_asistente
        FOREIGN KEY (asistente_id) REFERENCES dbo.uco_asistente (id)
);

INSERT INTO dbo.uco_evento (
    id, codigo_publico, nombre, descripcion, fecha_evento, hora_inicio, hora_fin,
    fecha_inicio_inscripcion, fecha_fin_inscripcion, cupos_maximos, cupos_disponibles,
    valor_inscripcion, modalidad, ubicacion, estado
) VALUES
('11111111-1111-1111-1111-111111111111', 'EVT-JUN-001', 'Congreso UCO de Innovacion Educativa',
 'Evento academico sobre innovacion y transformacion digital.', '2026-06-10', '08:00:00', '12:00:00',
 '2026-06-01', '2026-06-09', 120, 120, 50000, 'Presencial', 'Auditorio UCO', 'VIGENTE'),
('22222222-2222-2222-2222-222222222222', 'EVT-JUN-002', 'Foro Internacional de Investigacion UCO',
 'Encuentro de investigadores con enfoque internacional.', '2026-06-10', '09:00:00', '11:00:00',
 '2026-06-01', '2026-06-09', 80, 80, 65000, 'Presencial', 'Bloque Maria Bernarda', 'VIGENTE'),
('33333333-3333-3333-3333-333333333333', 'EVT-JUN-003', 'Seminario de Liderazgo Juvenil',
 'Formacion en liderazgo para estudiantes y egresados.', '2026-06-12', '14:00:00', '18:00:00',
 '2026-06-01', '2026-06-11', 100, 100, 30000, 'Presencial', 'Centro de Convenciones UCO', 'VIGENTE');