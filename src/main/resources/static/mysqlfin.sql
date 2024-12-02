create database mipequeniajungla;
use mipequeniajungla;


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `alergias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `sintomas` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `alergias` (`id`, `nombre`, `sintomas`) VALUES
(3, 'Run Run', 'fdgdgdgd');

CREATE TABLE `cirugias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `detalles` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `cirugias` (`id`, `nombre`, `detalles`, `precio`) VALUES
(3, 'dsad', 'fvghjfgh', 500);


CREATE TABLE `citas` (
  `id` int(11) NOT NULL,
  `id_mascota` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` varchar(8) DEFAULT NULL,
  `estatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `cita_servicio` (
  `id_cita` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `telefono_movil` bigint(20) NOT NULL,
  `telefono_fijo` bigint(20) DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `numero` int(4) DEFAULT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `colonia` varchar(255) DEFAULT NULL,
  `codigo_postal` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `estatus` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `clientes` (`id`, `telefono_movil`, `telefono_fijo`, `correo_electronico`, `numero`, `calle`, `colonia`, `codigo_postal`, `nombre`, `apellido_paterno`, `apellido_materno`, `estatus`) VALUES
(1, 5353535345, 646464, 'fdgd@gmail.com', 170, 'Lago atitlan', 'AGUA AZUL', '57500', 'OBED DEMIAN', 'MORA', 'SANTAMARIA', 'activo'),
(2, 656464, 6456464, 'fdgd@gmail.com', 423, 'Lago atitlan', 'AGUA AZUL', '57500', 'OBED DEMIAN', 'MORA', 'SANTAMARIA', 'activo');


CREATE TABLE `contratos` (
  `id` int(11) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_servicio` int(11) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_finalizacion` date NOT NULL,
  `hora` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `diagnosticos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_diagnostico` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `diagnosticos` (`id`, `nombre`, `descripcion`, `fecha_diagnostico`) VALUES
(2, 'dsad', 'dada', '2024-12-23');


CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `telefono_movil` bigint(20) NOT NULL,
  `telefono_fijo` bigint(20) DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `fecha_de_inicio` date DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `cedula_profesional` varchar(255) DEFAULT NULL,
  `estatus` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `empleados` (`id`, `telefono_movil`, `telefono_fijo`, `correo_electronico`, `fecha_de_inicio`, `imagen`, `nombre`, `apellido_paterno`, `apellido_materno`, `cedula_profesional`, `estatus`) VALUES
(2, 654646464, 646464, 'fdgd@gmail.com', '2024-11-09', '', 'OBED DEMIAN', 'SANTAMARIA', 'MORA', '5335453453', 'inactivo'),
(3, 5635355345, 5353535354, 'fdgd@gmail.com', '2024-12-19', '', 'OBED DEMIAN', 'SANTAMARIA', 'MORA', '5335453453453', 'activo');


CREATE TABLE `fabricantes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `fabricantes` (`id`, `nombre`) VALUES
(2, 'OBED DEMIANasd');


CREATE TABLE `historial_alergias` (
  `id` int(11) NOT NULL,
  `id_historial_clinico` int(11) DEFAULT NULL,
  `id_alergia` int(11) DEFAULT NULL,
  `fecha_diagnostico` date DEFAULT NULL,
  `observaciones` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `historial_cirugia` (
  `id` int(11) NOT NULL,
  `id_historial_clinico` int(4) DEFAULT NULL,
  `id_cirugia` int(11) DEFAULT NULL,
  `fecha_cirugia` date DEFAULT NULL,
  `observaciones` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `historial_clinico` (
  `id` int(11) NOT NULL,
  `id_mascota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `historial_diagnosticos` (
  `id` int(11) NOT NULL,
  `id_historial_clinico` int(11) DEFAULT NULL,
  `id_diagnostico` int(11) DEFAULT NULL,
  `fecha_diagnostico` date DEFAULT NULL,
  `detalles` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `historial_tratamientos` (
  `id` int(11) NOT NULL,
  `id_historial_clinico` int(11) DEFAULT NULL,
  `id_tratamiento` int(11) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `historial_vacunas` (
  `id` int(11) NOT NULL,
  `id_vacuna` int(11) DEFAULT NULL,
  `id_historial_clinico` int(11) DEFAULT NULL,
  `fecha_admicion` date NOT NULL,
  `dosis` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `insumos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `insumos` (`id`, `nombre`, `descripcion`, `tipo`) VALUES
(2, 'Run Run', 'asfsafsxdddddd', 'vacuna');

CREATE TABLE `inventario` (
  `id` int(11) NOT NULL,
  `id_insumo` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `costo` double NOT NULL,
  `cantidad` int(4) NOT NULL,
  `estatus` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `inventario` (`id`, `id_insumo`, `nombre`, `costo`, `cantidad`, `estatus`, `imagen`) VALUES
(1, 2, 'Run Run', 500, 8, 'disponible', 'imagen.png'),
(2, 2, 'Monovolumen ', 545, 0, 'no disponible', 'imagen.png');


CREATE TABLE `mascotas` (
  `id` int(11) NOT NULL,
  `id_cliente` int(4) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `raza` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `fecha_de_nacimiento` date DEFAULT NULL,
  `talla` double NOT NULL,
  `peso` double NOT NULL,
  `estatus` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `mascotas` (`id`, `id_cliente`, `imagen`, `nombre`, `tipo`, `raza`, `sexo`, `color`, `fecha_de_nacimiento`, `talla`, `peso`, `estatus`) VALUES
(2, 1, '', 'pene', 'perro', 'labrador', 'macho', 'Negro', '2024-12-11', 12, 45, 'activo');

CREATE TABLE `servicios` (
  `id` int(11) NOT NULL,
  `nombre_servicio` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `costo_servicio` double DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `servicios` (`id`, `nombre_servicio`, `descripcion`, `costo_servicio`, `imagen`) VALUES
(9, 'Run Run', '43424', 321, 'perro.jpg'),
(10, 'Monovolumen ', 'asfsafsxdddddd', 600, 'perro.jpg'),
(11, 'Run Run', 'sdad', 54, 'perro.jpg');

CREATE TABLE `tratamientos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `dias_duracion` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `tratamientos` (`id`, `nombre`, `descripcion`, `dias_duracion`) VALUES
(2, 'Run Run', 'dada', 5);

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `usuarios` (`id`, `id_empleado`, `contrasenia`, `rol`) VALUES
(2, 2, '123456', 'veterinario');

CREATE TABLE `vacunas` (
  `id` int(11) NOT NULL,
  `id_fabricante` int(11) DEFAULT NULL,
  `id_insumo` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `dosis_requerida` double DEFAULT NULL,
  `tipo_vacuna` varchar(255) DEFAULT NULL,
  `costo_unitario` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `vacunas` (`id`, `id_fabricante`, `id_insumo`, `nombre`, `dosis_requerida`, `tipo_vacuna`, `costo_unitario`) VALUES
(2, 2, NULL, 'OBED DEMIAN', 345, 'tipo 2', 359);


ALTER TABLE `alergias`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `cirugias`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `citas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_empleado` (`id_empleado`),
  ADD KEY `id_mascota` (`id_mascota`),
  ADD KEY `id_cliente` (`id_cliente`);

ALTER TABLE `cita_servicio`
  ADD PRIMARY KEY (`id_cita`,`id_servicio`),
  ADD KEY `id_servicio` (`id_servicio`);

ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `contratos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_servicio` (`id_servicio`);


ALTER TABLE `diagnosticos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `fabricantes`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `historial_alergias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_historial_clinico` (`id_historial_clinico`),
  ADD KEY `id_alergia` (`id_alergia`);

ALTER TABLE `historial_cirugia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_historial_clinico` (`id_historial_clinico`),
  ADD KEY `id_cirugia` (`id_cirugia`);

ALTER TABLE `historial_clinico`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`);


ALTER TABLE `historial_diagnosticos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_historial_clinico` (`id_historial_clinico`),
  ADD KEY `id_diagnostico` (`id_diagnostico`);

ALTER TABLE `historial_tratamientos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_historial_clinico` (`id_historial_clinico`),
  ADD KEY `id_tratamiento` (`id_tratamiento`);

ALTER TABLE `historial_vacunas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_vacuna` (`id_vacuna`),
  ADD KEY `id_historial_clinico` (`id_historial_clinico`);

ALTER TABLE `insumos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_insumo` (`id_insumo`);


ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`);


ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_empleado` (`id_empleado`);

ALTER TABLE `vacunas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_fabricante` (`id_fabricante`),
  ADD KEY `id_insumo` (`id_insumo`);

ALTER TABLE `alergias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `cirugias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `citas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `contratos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `diagnosticos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

ALTER TABLE `fabricantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `historial_alergias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `historial_cirugia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `historial_clinico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `historial_diagnosticos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `historial_tratamientos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `historial_vacunas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `insumos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `inventario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `mascotas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `servicios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

ALTER TABLE `tratamientos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `vacunas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`),
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`id_mascota`) REFERENCES `mascotas` (`id`),
  ADD CONSTRAINT `citas_ibfk_3` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`);

ALTER TABLE `cita_servicio`
  ADD CONSTRAINT `cita_servicio_ibfk_1` FOREIGN KEY (`id_cita`) REFERENCES `citas` (`id`),
  ADD CONSTRAINT `cita_servicio_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicios` (`id`);

ALTER TABLE `contratos`
  ADD CONSTRAINT `contratos_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`),
  ADD CONSTRAINT `contratos_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicios` (`id`);

ALTER TABLE `historial_alergias`
  ADD CONSTRAINT `historial_alergias_ibfk_1` FOREIGN KEY (`id_historial_clinico`) REFERENCES `historial_clinico` (`id`),
  ADD CONSTRAINT `historial_alergias_ibfk_2` FOREIGN KEY (`id_alergia`) REFERENCES `alergias` (`id`);

ALTER TABLE `historial_cirugia`
  ADD CONSTRAINT `historial_cirugia_ibfk_1` FOREIGN KEY (`id_historial_clinico`) REFERENCES `historial_clinico` (`id`),
  ADD CONSTRAINT `historial_cirugia_ibfk_2` FOREIGN KEY (`id_cirugia`) REFERENCES `cirugias` (`id`);

ALTER TABLE `historial_clinico`
  ADD CONSTRAINT `historial_clinico_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascotas` (`id`);

ALTER TABLE `historial_diagnosticos`
  ADD CONSTRAINT `historial_diagnosticos_ibfk_1` FOREIGN KEY (`id_historial_clinico`) REFERENCES `historial_clinico` (`id`),
  ADD CONSTRAINT `historial_diagnosticos_ibfk_2` FOREIGN KEY (`id_diagnostico`) REFERENCES `diagnosticos` (`id`);

ALTER TABLE `historial_tratamientos`
  ADD CONSTRAINT `historial_tratamientos_ibfk_1` FOREIGN KEY (`id_historial_clinico`) REFERENCES `historial_clinico` (`id`),
  ADD CONSTRAINT `historial_tratamientos_ibfk_2` FOREIGN KEY (`id_tratamiento`) REFERENCES `tratamientos` (`id`);

ALTER TABLE `historial_vacunas`
  ADD CONSTRAINT `historial_vacunas_ibfk_1` FOREIGN KEY (`id_vacuna`) REFERENCES `vacunas` (`id`),
  ADD CONSTRAINT `historial_vacunas_ibfk_2` FOREIGN KEY (`id_historial_clinico`) REFERENCES `historial_clinico` (`id`);

ALTER TABLE `inventario`
  ADD CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`id_insumo`) REFERENCES `insumos` (`id`);

ALTER TABLE `mascotas`
  ADD CONSTRAINT `mascotas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`);

ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`);

ALTER TABLE `vacunas`
  ADD CONSTRAINT `vacunas_ibfk_1` FOREIGN KEY (`id_fabricante`) REFERENCES `fabricantes` (`id`),
  ADD CONSTRAINT `vacunas_ibfk_2` FOREIGN KEY (`id_insumo`) REFERENCES `insumos` (`id`);
COMMIT;
