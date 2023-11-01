# Api-Rest
Api Rest whit SpringBoot and Postgresql

Query Postgresql:
-- Crear la base de datos "db_ApiRest" en PostgreSQL
CREATE DATABASE db_ApiRest;


-- Crea la tabla "clientes"
CREATE TABLE clientes (
  id_cliente SERIAL PRIMARY KEY,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  fecha_registro DATE NOT NULL
);

-- Inserta datos en la tabla "clientes"
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES
('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01'),
('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02'),
('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03'),
('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');


