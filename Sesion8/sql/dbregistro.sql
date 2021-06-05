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
insert into persona(nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion) values('Brainer', 'Barrios', 'Mena', '99999999', 'brabame@hotmail.com', 'Quebec, Canadá');
insert into persona(nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion) values('Elivia', 'Mena', 'García', '3173247028', 'llivimaria07@hotmail.com', 'Cartagena, Colombia');

select * from persona; 

select id, nombres, apellido_paterno, apellido_materno, telefono from persona where estado = 1;
select id, nombres, apellido_paterno, apellido_materno, telefono from persona where estado = 1 and (nombres like '%%' or apellido_paterno like '%%' or apellido_materno like '%%');