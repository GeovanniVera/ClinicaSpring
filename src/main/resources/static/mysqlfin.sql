CREATE DATABASE mipeqeuniajungla;

USE MIPEQUENIAJUNGLA;

CREATE TABLE CLIENTES (
    id INT(4) AUTO_INCREMENT,
    telefono_movil BIGINT NOT NULL,
    telefono_fijo BIGINT,
    correo_electronico VARCHAR(320) NOT NULL,
    numero INT(4),
    calle VARCHAR(50),
    colonia VARCHAR(50),
    codigo_postal INT(8),
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50),
    estatus VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_cliente)
);

CREATE TABLE MASCOTAS (
    id_mascota INT(4) AUTO_INCREMENT,
    id_cliente INT(4),
    nombre VARCHAR(50),
    tipo VARCHAR(40),
    raza VARCHAR(50),
    sexo VARCHAR(12),
    color VARCHAR(15),
    fecha_de_nacimiento DATE,
    talla DECIMAL(4, 2),
    peso DECIMAL(4, 2),
    estatus VARCHAR(50),
    PRIMARY KEY(id_mascota),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente)
);

CREATE TABLE SERVICIOS (
    id_servicio INT(4) AUTO_INCREMENT,
    nombre_servicio VARCHAR(50),
    descripcion VARCHAR(320),
    precio_servicio DECIMAL(8, 2),
    imagen VARCHAR(200),
    PRIMARY KEY(id_servicio)
);

CREATE TABLE CONTRATOS (
    id_contrato INT(8) AUTO_INCREMENT,
    id_cliente INT(4),
    id_servicio INT(4),
    fecha_inicio DATE NOT NULL,
    fecha_finalizacion DATE NOT NULL,
    hora VARCHAR(8) NOT NULL,
    PRIMARY KEY(id_contrato),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente),
    FOREIGN KEY (id_servicio) REFERENCES SERVICIOS(id_servicio)
);

CREATE TABLE EMPLEADOS (
    id_empleado INT(4) AUTO_INCREMENT,
    telefono_movil BIGINT NOT NULL,
    telefono_fijo BIGINT,
    correo_electronico VARCHAR(320) NOT NULL,
    fecha_de_inicio DATE,
    imagen VARCHAR(200),
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50),
    cedula_profesional VARCHAR(10),
    rol VARCHAR(50),
    estatus VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_empleado),
);

CREATE TABLE USUARIOS (
    id_usuario INT(4) AUTO_INCREMENT,
    id_empleado INT(4),
    contrasena VARCHAR(50) NOT NULL,
    rol VARCHAR(50),
    PRIMARY KEY(id_usuario),
    FOREIGN KEY(id_empleado) REFERENCES EMPLEADOS(id_empleado)
);

CREATE TABLE CITAS (
    id_cita INT(8) AUTO_INCREMENT,
    id_mascota INT(4),
    id_cliente INT(4),
    id_empleado INT(4),
    fecha DATE,
    hora VARCHAR(8),
    estatus VARCHAR(50),
    PRIMARY KEY(id_cita),
    FOREIGN KEY(id_empleado) REFERENCES EMPLEADOS(id_empleado),
    FOREIGN KEY(id_mascota) REFERENCES MASCOTAS(id_mascota),
    FOREIGN KEY(id_cliente) REFERENCES CLIENTES(id_cliente)
);

CREATE TABLE CITA_SERVICIO (
    id_cita INT(8),
    id_servicio INT(4),
    PRIMARY KEY(id_cita, id_servicio),
    FOREIGN KEY(id_cita) REFERENCES CITAS(id_cita),
    FOREIGN KEY(id_servicio) REFERENCES SERVICIOS(id_servicio)
);

CREATE TABLE DIAGNOSTICOS (
    id_diagnostico INT(4) AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(320) NOT NULL,
    PRIMARY KEY(id_diagnostico)
);

CREATE TABLE TRATAMIENTOS (
    id_tratamiento INT(4) AUTO_INCREMENT,
    nombre VARCHAR(40) NOT NULL,
    descripcion VARCHAR(320) NOT NULL,
    dias_duracion INT(3),
    PRIMARY KEY(id_tratamiento)
);

CREATE TABLE FABRICANTES (
    id_fabricante INT(4) AUTO_INCREMENT,
    nombre VARCHAR(40),
    PRIMARY KEY(id_fabricante)
);

CREATE TABLE INSUMOS (
    id_insumo INT(4) AUTO_INCREMENT,
    nombre VARCHAR(50),
    descripcion VARCHAR(320),
    tipo VARCHAR(50),
    PRIMARY KEY(id_insumo)
);

CREATE TABLE VACUNAS (
    id_vacuna INT(4) AUTO_INCREMENT,
    id_fabricante INT(4),
    id_insumo INT(4),
    nombre VARCHAR(50),
    dosis_requerida INT(1),
    PRIMARY KEY(id_vacuna),
    FOREIGN KEY(id_fabricante) REFERENCES FABRICANTES(id_fabricante),
    FOREIGN KEY(id_insumo) REFERENCES INSUMOS(id_insumo)
);

CREATE TABLE CIRUGIAS (
    id_cirugia INT(8) AUTO_INCREMENT,
    nombre VARCHAR(50),
    PRIMARY KEY(id_cirugia)
);

CREATE TABLE ALERGIA (
    id_alergia INT(4) AUTO_INCREMENT,
    nombre VARCHAR(50),
    PRIMARY KEY(id_alergia)
);

CREATE TABLE INVENTARIO (
    id_inventario INT(8) AUTO_INCREMENT,
    id_insumo INT(4),
    nombre VARCHAR(50) NOT NULL,
    costo DECIMAL(8, 2) NOT NULL,
    cantidad INT(4) NOT NULL,
    estatus VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_inventario),
    FOREIGN KEY(id_insumo) REFERENCES INSUMOS(id_insumo)
);

CREATE TABLE HISTORIAL_CLINICO (
    id_historial_clinico INT(4) AUTO_INCREMENT,
    id_mascota INT(4),
    PRIMARY KEY(id_historial_clinico),
    FOREIGN KEY(id_mascota) REFERENCES MASCOTAS(id_mascota)
);

CREATE TABLE HISTORIAL_VACUNAS (
    id_historial_vacuna INT(4) AUTO_INCREMENT,
    id_vacuna INT(4),
    id_historial_clinico INT(4),
    fecha_admicion DATE NOT NULL,
    dosis INT(1),
    PRIMARY KEY(id_historial_vacuna),
    FOREIGN KEY(id_vacuna) REFERENCES VACUNAS(id_vacuna),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id_historial_clinico)
);

CREATE TABLE HISTORIAL_TRATAMIENTOS (
    id_historial_trat INT(4) AUTO_INCREMENT,
    id_historial_clinico INT(4),
    id_tratamiento INT(4),
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    PRIMARY KEY(id_historial_trat),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id_historial_clinico),
    FOREIGN KEY(id_tratamiento) REFERENCES TRATAMIENTOS(id_tratamiento)
);

CREATE TABLE HISTORIAL_DIAGNOSTICOS (
    id_historial_diagnosticos INT(4) AUTO_INCREMENT,
    id_historial_clinico INT(4),
    id_diagnostico INT(4),
    fecha_diagnostico DATE,
    detalles VARCHAR(400),
    PRIMARY KEY(id_historial_diagnosticos),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id_historial_clinico),
    FOREIGN KEY(id_diagnostico) REFERENCES DIAGNOSTICOS(id_diagnostico)
);

CREATE TABLE HISTORIAL_CIRUGIA (
    id_historial_cirugia INT(4) AUTO_INCREMENT,
    id_historial_clinico INT(4),
    id_cirugia INT(4),
    fecha_cirugia DATE,
    observaciones VARCHAR(200),
    PRIMARY KEY(id_historial_cirugia),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id_historial_clinico),
    FOREIGN KEY(id_cirugia) REFERENCES CIRUGIAS(id_cirugia)
);

CREATE TABLE HISTORIAL_ALERGIAS (
    id_historial_alergias INT(4) AUTO_INCREMENT,
    id_historial_clinico INT(4),
    id_alergia INT(4),
    fecha_diagnostico DATE,
    observaciones VARCHAR(200),
    PRIMARY KEY(id_historial_alergias),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id_historial_clinico),
    FOREIGN KEY(id_alergia) REFERENCES ALERGIA(id_alergia)
);
