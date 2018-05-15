CREATE DATABASE supermercado;
USE supermercado;

CREATE TABLE usuario
  (
    usuario VARCHAR (10) ,
    clave VARCHAR (32) ,
    nombre VARCHAR (50) 
  ) ;
ALTER TABLE usuario ADD CONSTRAINT usuario_PK PRIMARY KEY ( usuario ) ;

CREATE TABLE producto
  (
    codigo SMALLINT,
    descripcion VARCHAR (20) NOT NULL,
    cod_marca SMALLINT
  ) ;
ALTER TABLE producto ADD CONSTRAINT producto_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE marca
  (
    codigo SMALLINT,
    descripcion VARCHAR (15) 
  ) ;
ALTER TABLE marca ADD CONSTRAINT marca_PK PRIMARY KEY ( codigo ) ;

ALTER TABLE producto ADD CONSTRAINT producto_marca_FK FOREIGN KEY ( cod_marca ) REFERENCES marca ( codigo ) ;

insert into marca values (1,'Coca Cola');
insert into marca values (2,'Pepsi');
insert into marca values (3,'Sprite');
insert into marca values (4,'Zaror');
insert into marca values (5,'Miraflores');

insert into producto values (1,'Bebida',1);
insert into producto values (2,'Bebida',2);
insert into producto values (3,'Bebida',3);
insert into producto values (4,'Arroz',5);

insert into usuario values ('duoc',null,'Usuario DUOC');
update usuario set clave=md5('duoc') where usuario='duoc'
