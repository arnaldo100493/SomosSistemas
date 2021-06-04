drop database if exists dbregistro;

create database dbregistro;
use dbregistro;

create table persona(
   id int not null auto_increment primary key,
   nombres varchar(200) not null,
   apellido_paterno varchar(200) not null,
   apellido_materno varchar(200) not null,
   telefono varchar(20),
   correo_electronico varchar(100) not null,
   direccion varchar(300) not null,
   estado int not null default 1,
   fecha_registro timestamp not null default current_timestamp
);

insert into persona(nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion) values('Arnaldo Andrés', 'Barrios', 'Mena', '3108293114', 'cyberarnaldo04@hotmail.com', 'Bogotá, Colombia');

select * from persona; 

select id, nombres, apellido_paterno, apellido_materno, telefono from persona;