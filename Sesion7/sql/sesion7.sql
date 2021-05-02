drop database if exists sesion7;

create database sesion7;
use sesion7;

create table producto(
   codigo_producto int auto_increment key,
   nombre varchar(200) not null,
   precio float not null,
   codigo_marca int not null,
   fecha_registro date not null,
   constraint fk_codigo_marca foreign key (codigo_marca) references marca(codigo_marca)
);

create table marca(
codigo_marca int auto_increment primary key,
nombre varchar(200) not null
);

create table detalle_producto(
  codigo_detalle_producto int auto_increment primary key,
  codigo_producto int not null,
  nombre varchar(50) not null,
  descripcion varchar(100),
  constraint fk_codigo_producto foreign key(codigo_producto) references producto(codigo_producto)
);

alter table producto add foreign key (codigo_marca) references marca(codigo_marca);

insert into marca(nombre) values('Oreo');
insert into marca(nombre) values('Gloria');
insert into marca(nombre) values('Nestle');
insert into marca(nombre) values('Tentación');
insert into marca(nombre) values('San Fernando');

select * from marca;

insert into producto(nombre, precio, codigo_marca, fecha_registro) values('Galletita', 1.5, 1, '2021-04-21');
insert into producto(nombre, precio, codigo_marca, fecha_registro) values('Paneton', 20, 2, '2021-04-26');
insert into producto(nombre, precio, codigo_marca, fecha_registro) values('Paneton Bimbo', 25, 4, '2021-04-27');

select * from producto;