--------------------------------------------------------
-- Archivo creado  - lunes-febrero-06-2012   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence SEQ_DETALLE_PEDIDO
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_DETALLE_PEDIDO"  MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_PEDIDO
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_PEDIDO"  MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table DETALLE_PEDIDO
--------------------------------------------------------

  CREATE TABLE "DETALLE_PEDIDO" 
   (	"ID_DETALLE_PEDIDO" NUMBER(*,0), 
	"CANTIDAD" NUMBER(18,2), 
	"PRECIO" NUMBER(18,2), 
	"COD_PRODUCTO" CHAR(2 CHAR), 
	"ID_PEDIDO" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PEDIDO
--------------------------------------------------------

  CREATE TABLE "PEDIDO" 
   (	"ID_PEDIDO" NUMBER(*,0), 
	"CLIENTE" VARCHAR2(200 CHAR), 
	"DIRECCION" VARCHAR2(200 CHAR), 
	"TELEFONO" VARCHAR2(10 CHAR), 
	"FECHA" DATE, 
	"IMPORTE" NUMBER(18,2), 
	"PAGO" NUMBER(18,2), 
	"VUELTO" NUMBER(18,2), 
	"ESTADO" CHAR(1 CHAR), 
	"MODALIDAD" CHAR(1 CHAR), 
	"COD_SUCURSAL" CHAR(2 CHAR), 
	"COD_USUARIO" CHAR(2 CHAR)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCTO
--------------------------------------------------------

  CREATE TABLE "PRODUCTO" 
   (	"COD_PRODUCTO" CHAR(2 CHAR), 
	"NOMBRE" VARCHAR2(100 CHAR), 
	"PRECIO" NUMBER(18,2)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SUCURSAL
--------------------------------------------------------

  CREATE TABLE "SUCURSAL" 
   (	"COD_SUCURSAL" CHAR(2 CHAR), 
	"NOMBRE" VARCHAR2(100 CHAR)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USUARIO
--------------------------------------------------------

  CREATE TABLE "USUARIO" 
   (	"COD_USUARIO" CHAR(2 CHAR), 
	"NOMBRE" VARCHAR2(200 CHAR), 
	"NICK" VARCHAR2(100 CHAR), 
	"CLAVE" VARCHAR2(200 CHAR), 
	"COD_SUCURSAL" CHAR(2 CHAR)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into DETALLE_PEDIDO
REM INSERTING into PEDIDO
REM INSERTING into PRODUCTO
Insert into PRODUCTO (COD_PRODUCTO,NOMBRE,PRECIO) values ('01','PIZZA ESPECIAL',31,5);
Insert into PRODUCTO (COD_PRODUCTO,NOMBRE,PRECIO) values ('02','PIZZA MIXTA',23,5);
Insert into PRODUCTO (COD_PRODUCTO,NOMBRE,PRECIO) values ('03','PIZZA AMERICANA',21);
Insert into PRODUCTO (COD_PRODUCTO,NOMBRE,PRECIO) values ('04','PIZZA SUPER',23);
REM INSERTING into SUCURSAL
Insert into SUCURSAL (COD_SUCURSAL,NOMBRE) values ('01','CHICLAYO');
Insert into SUCURSAL (COD_SUCURSAL,NOMBRE) values ('02','PIURA');
Insert into SUCURSAL (COD_SUCURSAL,NOMBRE) values ('03','TRUJILLO');
Insert into SUCURSAL (COD_SUCURSAL,NOMBRE) values ('04','TUMBES');
Insert into SUCURSAL (COD_SUCURSAL,NOMBRE) values ('05','CAJAMARCA');
REM INSERTING into USUARIO
Insert into USUARIO (COD_USUARIO,NOMBRE,NICK,CLAVE,COD_SUCURSAL) values ('01','JORGE LUIS PEREZ DIAZ','jolupedi','admin','01');
Insert into USUARIO (COD_USUARIO,NOMBRE,NICK,CLAVE,COD_SUCURSAL) values ('02','LUIS ALBERTO ROJAS PAREDES','lualropa','MeCiZx','02');
Insert into USUARIO (COD_USUARIO,NOMBRE,NICK,CLAVE,COD_SUCURSAL) values ('03','ANA MARIA GONZALES ROJAS','anmagoro','LnQoNf','03');
Insert into USUARIO (COD_USUARIO,NOMBRE,NICK,CLAVE,COD_SUCURSAL) values ('04','PAUL ANDRES BECERRA DIAZ','paanbedi','BhSvIf','04');
Insert into USUARIO (COD_USUARIO,NOMBRE,NICK,CLAVE,COD_SUCURSAL) values ('05','PAULA MARIA LINARES PAREDES','pamalipa','NpJfCz','05');
--------------------------------------------------------
--  DDL for Index usuario PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "usuario PK" ON "USUARIO" ("COD_USUARIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index producto PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "producto PK" ON "PRODUCTO" ("COD_PRODUCTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index sucursal PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "sucursal PK" ON "SUCURSAL" ("COD_SUCURSAL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index detalle_pedido PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "detalle_pedido PK" ON "DETALLE_PEDIDO" ("ID_DETALLE_PEDIDO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index pedido PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "pedido PK" ON "PEDIDO" ("ID_PEDIDO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" MODIFY ("COD_USUARIO" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" MODIFY ("NOMBRE" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" MODIFY ("NICK" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" MODIFY ("CLAVE" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" MODIFY ("COD_SUCURSAL" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" ADD CONSTRAINT "usuario PK" PRIMARY KEY ("COD_USUARIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SUCURSAL
--------------------------------------------------------

  ALTER TABLE "SUCURSAL" MODIFY ("COD_SUCURSAL" NOT NULL ENABLE);
 
  ALTER TABLE "SUCURSAL" MODIFY ("NOMBRE" NOT NULL ENABLE);
 
  ALTER TABLE "SUCURSAL" ADD CONSTRAINT "sucursal PK" PRIMARY KEY ("COD_SUCURSAL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PEDIDO
--------------------------------------------------------

  ALTER TABLE "PEDIDO" ADD CONSTRAINT "CHK_PEDIDO_ESTADO" CHECK (estado in ('P','C','D','A')) ENABLE;
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "CHK_PEDIDO_IMPORTE" CHECK (importe>0) ENABLE;
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "CHK_PEDIDO_MODALIDAD" CHECK (MODALIDAD IN ('T', 'I')) ENABLE;
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "CHK_PEDIDO_PAGO" CHECK (PAGO >= IMPORTE) ENABLE;
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "CHK_PEDIDO_VUELTO" CHECK (VUELTO >= 0) ENABLE;
 
  ALTER TABLE "PEDIDO" MODIFY ("ID_PEDIDO" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("CLIENTE" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("DIRECCION" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("TELEFONO" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("FECHA" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("IMPORTE" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("PAGO" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("VUELTO" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("ESTADO" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" MODIFY ("MODALIDAD" NOT NULL ENABLE);
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "pedido PK" PRIMARY KEY ("ID_PEDIDO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table DETALLE_PEDIDO
--------------------------------------------------------

  ALTER TABLE "DETALLE_PEDIDO" MODIFY ("ID_DETALLE_PEDIDO" NOT NULL ENABLE);
 
  ALTER TABLE "DETALLE_PEDIDO" MODIFY ("CANTIDAD" NOT NULL ENABLE);
 
  ALTER TABLE "DETALLE_PEDIDO" MODIFY ("PRECIO" NOT NULL ENABLE);
 
  ALTER TABLE "DETALLE_PEDIDO" MODIFY ("COD_PRODUCTO" NOT NULL ENABLE);
 
  ALTER TABLE "DETALLE_PEDIDO" MODIFY ("ID_PEDIDO" NOT NULL ENABLE);
 
  ALTER TABLE "DETALLE_PEDIDO" ADD CONSTRAINT "detalle_pedido PK" PRIMARY KEY ("ID_DETALLE_PEDIDO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUCTO
--------------------------------------------------------

  ALTER TABLE "PRODUCTO" MODIFY ("COD_PRODUCTO" NOT NULL ENABLE);
 
  ALTER TABLE "PRODUCTO" MODIFY ("NOMBRE" NOT NULL ENABLE);
 
  ALTER TABLE "PRODUCTO" MODIFY ("PRECIO" NOT NULL ENABLE);
 
  ALTER TABLE "PRODUCTO" ADD CONSTRAINT "chk_producto_precio" CHECK (precio>0) ENABLE;
 
  ALTER TABLE "PRODUCTO" ADD CONSTRAINT "producto PK" PRIMARY KEY ("COD_PRODUCTO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DETALLE_PEDIDO
--------------------------------------------------------

  ALTER TABLE "DETALLE_PEDIDO" ADD CONSTRAINT "REL_PED_DET" FOREIGN KEY ("ID_PEDIDO")
	  REFERENCES "PEDIDO" ("ID_PEDIDO") ENABLE;
 
  ALTER TABLE "DETALLE_PEDIDO" ADD CONSTRAINT "REL_PROD_DET" FOREIGN KEY ("COD_PRODUCTO")
	  REFERENCES "PRODUCTO" ("COD_PRODUCTO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PEDIDO
--------------------------------------------------------

  ALTER TABLE "PEDIDO" ADD CONSTRAINT "REL_SUC_PED" FOREIGN KEY ("COD_SUCURSAL")
	  REFERENCES "SUCURSAL" ("COD_SUCURSAL") ON DELETE SET NULL ENABLE;
 
  ALTER TABLE "PEDIDO" ADD CONSTRAINT "REL_USU_PED" FOREIGN KEY ("COD_USUARIO")
	  REFERENCES "USUARIO" ("COD_USUARIO") ON DELETE SET NULL ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" ADD CONSTRAINT "REL_SUC_USU" FOREIGN KEY ("COD_SUCURSAL")
	  REFERENCES "SUCURSAL" ("COD_SUCURSAL") ENABLE;
--------------------------------------------------------
--  DDL for Trigger IDDETALLEPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "IDDETALLEPEDIDO" 
before insert on detalle_pedido
for each row 
begin
select SEQ_DETALLE_PEDIDO.NEXTVAL into:new.id_detalle_pedido from dual;
end;
/
ALTER TRIGGER "IDDETALLEPEDIDO" ENABLE;
--------------------------------------------------------
--  DDL for Function BEANDETALLEPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "BEANDETALLEPEDIDO" (iddetallepedido in number) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from detalle_pedido where id_detalle_pedido=iddetallepedido;
  return(cur);
end beandetallepedido;

/

--------------------------------------------------------
--  DDL for Function BEANPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "BEANPEDIDO" (idpedido in number) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from pedido where id_pedido=idpedido;
  return(cur);
end beanpedido;

/

--------------------------------------------------------
--  DDL for Function BEANPRODUCTO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "BEANPRODUCTO" (codigo in varchar2) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from producto where cod_producto=codigo;
  return(cur);
end beanproducto;

/

--------------------------------------------------------
--  DDL for Function BEANSUCURSAL
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "BEANSUCURSAL" (codigo in varchar2) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from sucursal where cod_sucursal=codigo;
  return(cur);
end beansucursal;

/

--------------------------------------------------------
--  DDL for Function BEANUSUARIO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "BEANUSUARIO" (codigo in varchar2) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from usuario where cod_usuario=codigo;
  return(cur);
end beanusuario;

/

--------------------------------------------------------
--  DDL for Function LISTARDETALLEPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "LISTARDETALLEPEDIDO" (idpedido in number) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from detalle_pedido where id_pedido=idpedido;
  return(cur);
end listardetallepedido;

/

--------------------------------------------------------
--  DDL for Function LISTARPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "LISTARPEDIDO" (codusuario in varchar2,codsucursal varchar2) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from pedido where cod_usuario=codusuario and cod_sucursal=codsucursal;
  return(cur);
end listarpedido;

/

--------------------------------------------------------
--  DDL for Function LISTARPRODUCTO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "LISTARPRODUCTO" RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from producto;
  return(cur);
end listarproducto;

/

--------------------------------------------------------
--  DDL for Function LISTARSUCURSAL
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "LISTARSUCURSAL" RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from sucursal;
  return(cur);
end listarsucursal;

/

--------------------------------------------------------
--  DDL for Function LOGEARUSUARIO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "LOGEARUSUARIO" (u in varchar2,p in varchar2) RETURN types.ref_cursor AS
  cur types.ref_cursor;
begin      
  OPEN cur FOR select * from usuario where nick=u and clave=p;
  return(cur);
end logearusuario;

/

--------------------------------------------------------
--  DDL for Function OBTENERSEQPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "OBTENERSEQPEDIDO" 
return number
AS
num number;
begin   
select seq_pedido.nextval into num from dual;
return num;
exception 
WHEN NO_DATA_FOUND THEN 
return -1;
WHEN OTHERS THEN
return -1;
end obtenerseqpedido;

/

--------------------------------------------------------
--  DDL for Function REGISTRARDETALLEPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "REGISTRARDETALLEPEDIDO" (pcantidad in number,pprecio in number,pcodproducto in varchar2,pidpedido in number)
return varchar2
AS
msg varchar2(20);
begin   
msg:='e';
INSERT INTO detalle_pedido(cantidad,precio,cod_producto,id_pedido)
VALUES (pcantidad,pprecio,pcodproducto,pidpedido);
select 'i' into msg from dual;
return msg;
exception 
WHEN NO_DATA_FOUND THEN 
return msg;
WHEN OTHERS THEN
return msg;
end registrardetallepedido;

/

--------------------------------------------------------
--  DDL for Function REGISTRARPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "REGISTRARPEDIDO" (pidpedido in number,pcliente in varchar2,pdireccion in varchar2,ptelefono in varchar2,pimporte in number,ppago in number,pvuelto in number,pestado in varchar2,pmodalidad in varchar2,pcod_sucursal in varchar2,pcod_usuario in varchar2)
return number
AS
num number;
begin   
INSERT INTO pedido (id_pedido,cliente,direccion,telefono,fecha,importe,pago,vuelto,estado,modalidad,cod_sucursal,cod_usuario)
VALUES (pidpedido,pcliente,pdireccion,ptelefono,sysdate,pimporte,ppago,pvuelto,pestado,pmodalidad,pcod_sucursal,pcod_usuario);
select pidpedido into num from dual;
return num;
exception 
WHEN NO_DATA_FOUND THEN 
return -1;
WHEN OTHERS THEN
return -1;
end registrarpedido;

/

--------------------------------------------------------
--  DDL for Function UPDATEESTADOPEDIDO
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "UPDATEESTADOPEDIDO" (pidpedido in number,pestado in varchar2)
return number
AS
num number;
begin   
update pedido set estado=pestado where id_pedido=pidpedido;
select pidpedido into num from dual;
return num;
exception 
WHEN NO_DATA_FOUND THEN 
return -1;
WHEN OTHERS THEN
return -1;
end updateestadopedido;

/

--------------------------------------------------------
--  DDL for Package TYPES
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "TYPES" 
AS
TYPE ref_cursor IS REF CURSOR;
END;

/

