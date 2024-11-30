CREATE DATABASE mipeqeuniajungla;

USE mipeqeuniajungla;

CREATE TABLE clientes (
    id INT AUTO_INCREMENT,
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
    PRIMARY KEY(id)
);

CREATE TABLE mascotas (
    id INT AUTO_INCREMENT,
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
    PRIMARY KEY(id),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id)
);

CREATE TABLE servicios (
    id INT AUTO_INCREMENT,
    nombre_servicio VARCHAR(50),
    descripcion VARCHAR(320),
    costo_servicio DECIMAL(8, 2),
    imagen VARCHAR(200),
    PRIMARY KEY(id)
);

CREATE TABLE contratos (
    id INT AUTO_INCREMENT,
    id_cliente INT,
    id_servicio INT,
    fecha_inicio DATE NOT NULL,
    fecha_finalizacion DATE NOT NULL,
    hora VARCHAR(8) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id),
    FOREIGN KEY (id_servicio) REFERENCES SERVICIOS(id)
);

CREATE TABLE empleados (
    id INT AUTO_INCREMENT,
    telefono_movil BIGINT NOT NULL,
    telefono_fijo BIGINT,
    correo_electronico VARCHAR(320) NOT NULL,
    fecha_de_inicio DATE,
    imagen VARCHAR(200),
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50),
    cedula_profesional VARCHAR(10),
    estatus VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    id_empleado INT,
    contrasenia VARCHAR(50) NOT NULL,
    rol VARCHAR(50),
    PRIMARY KEY(id),
    FOREIGN KEY(id_empleado) REFERENCES EMPLEADOS(id)
);

CREATE TABLE citas (
    id INT AUTO_INCREMENT,
    id_mascota INT,
    id_cliente INT,
    id_empleado INT,
    fecha DATE,
    hora VARCHAR(8),
    estatus VARCHAR(50),
    PRIMARY KEY(id),
    FOREIGN KEY(id_empleado) REFERENCES EMPLEADOS(id),
    FOREIGN KEY(id_mascota) REFERENCES MASCOTAS(id),
    FOREIGN KEY(id_cliente) REFERENCES CLIENTES(id)
);

CREATE TABLE cita_servicio (
    id_cita INT,
    id_servicio INT,
    PRIMARY KEY(id_cita, id_servicio),
    FOREIGN KEY(id_cita) REFERENCES CITAS(id),
    FOREIGN KEY(id_servicio) REFERENCES SERVICIOS(id)
);

CREATE TABLE diagnosticos (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(320) NOT NULL,
    fecha_diagnostico DATE,
    PRIMARY KEY(id)
);

CREATE TABLE tratamientos (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(40) NOT NULL,
    descripcion VARCHAR(320) NOT NULL,
    dias_duracion INT(3),
    PRIMARY KEY(id)
);

CREATE TABLE fabricantes (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(40),
    PRIMARY KEY(id)
);

CREATE TABLE insumos (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    descripcion VARCHAR(320),
    tipo VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE vacunas (
    id INT AUTO_INCREMENT,
    id_fabricante INT,
    id_insumo INT,
    nombre VARCHAR(50),
    dosis_requerida DECIMAL(4,2),
    PRIMARY KEY(id),
    FOREIGN KEY(id_fabricante) REFERENCES FABRICANTES(id),
    FOREIGN KEY(id_insumo) REFERENCES INSUMOS(id)
);

CREATE TABLE cirugias (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE alergias (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    sintomas text,
    PRIMARY KEY(id)
);

CREATE TABLE inventario (
    id INT AUTO_INCREMENT,
    id_insumo INT,
    nombre VARCHAR(50) NOT NULL,
    costo DECIMAL(8, 2) NOT NULL,
    cantidad INT(4) NOT NULL,
    estatus VARCHAR(50) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_insumo) REFERENCES INSUMOS(id)
);

CREATE TABLE historial_clinico (
    id INT AUTO_INCREMENT,
    id_mascota INT,
    PRIMARY KEY(id),
    FOREIGN KEY(id_mascota) REFERENCES MASCOTAS(id)
);

CREATE TABLE historial_vacunas (
    id INT AUTO_INCREMENT,
    id_vacuna INT,
    id_historial_clinico INT,
    fecha_admicion DATE NOT NULL,
    dosis INT(1),
    PRIMARY KEY(id),
    FOREIGN KEY(id_vacuna) REFERENCES VACUNAS(id),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id)
);

CREATE TABLE historial_tratamientos (
    id INT AUTO_INCREMENT,
    id_historial_clinico INT,
    id_tratamiento INT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id),
    FOREIGN KEY(id_tratamiento) REFERENCES TRATAMIENTOS(id)
);

CREATE TABLE historial_diagnosticos (
    id INT AUTO_INCREMENT,
    id_historial_clinico INT,
    id_diagnostico INT,
    fecha_diagnostico DATE,
    detalles VARCHAR(400),
    PRIMARY KEY(id),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id),
    FOREIGN KEY(id_diagnostico) REFERENCES DIAGNOSTICOS(id)
);

CREATE TABLE historial_cirugia (
    id INT AUTO_INCREMENT,
    id_historial_clinico INT(4),
    id_cirugia INT,
    fecha_cirugia DATE,
    observaciones VARCHAR(200),
    PRIMARY KEY(id),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id),
    FOREIGN KEY(id_cirugia) REFERENCES CIRUGIAS(id)
);

CREATE TABLE historial_alergias (
    id INT AUTO_INCREMENT,
    id_historial_clinico INT,
    id_alergia INT,
    fecha_diagnostico DATE,
    observaciones VARCHAR(200),
    PRIMARY KEY(id),
    FOREIGN KEY(id_historial_clinico) REFERENCES HISTORIAL_CLINICO(id),
    FOREIGN KEY(id_alergia) REFERENCES ALERGIAS(id)
);
