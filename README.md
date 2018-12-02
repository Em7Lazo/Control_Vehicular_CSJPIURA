# Control_Vehicular_CSJPIURA
Sistema de Control Vehicular

     UNIVERSIDAD PRIVADA ANTENOR ORREGO
                 FACULTAD DE INGENIERÍA
         ESCUELA PROFESIONAL DE INGENIERIA DE COMPUTACIÓN Y  SISTEMAS


![](https://i.imgur.com/mVJhcNs.jpg)

      DESARROLLO DE APLICACIONES PARA DISPOSITIVOS MOVILES

       SISTEMA VEHICULAR CORTE SUPERIOR DE JUSTICIA DE PIURA

INTEGRANTES:

Luis Alberto Pérez Sánchez
Carlos Lazo Flores
Walter Rufino Rivera
Luis Carrasco Cortez

PROFESOR:

Ing. ALI ALFONSO LOZANO CHU

PIURA – PERÚ
2018



**Introducción:**

Una aplicación móvil es un software que puede ser descargado, instalado y ejecutado en un dispositivo móvil ya sea smartphone o tablet  y que ofrecen al usuario muchos servicios, ya sea para entretenimiento, productividad, entre otros.

Al tener a la mano una alternativa para facilitar mis labores diarias ya sea para el hogar, estudio o trabajo las apps de los dispositivos móviles facilitan las labores del día a día y me permiten realizar casi cualquier actividad en cualquier lugar.

La tendencia de usar aplicaciones móviles en la actualidad ha crecido rápidamente, facilitando a las personas estar en contacto con los demás y consultar información en cualquier momento superando la barrera de la distancia y convirtiéndose en la principal herramienta para estar conectados a las redes sociales, el Internet y redes empresariales.

Las apps, cobran cada vez más importancia y son indispensables para nuestra vida diaria prestando múltiples funciones que ofrecen una experiencia de usuario amigable, eficiente y más completa, al incorporar elementos como vídeo, sonido, imágenes, texto, geolocalización, entre otros.


**I.	PROTOTIPOS**


![](https://i.imgur.com/mAFrYgK.png)



![](https://i.imgur.com/u9bSdFD.png)

 

![](https://i.imgur.com/0tsKDME.png)


![](https://i.imgur.com/5cT2JHc.png)


![](https://i.imgur.com/wTxytzB.png)


![](https://i.imgur.com/ha50O7V.png)
![](https://i.imgur.com/lhjSa7k.png)

![](https://i.imgur.com/T04fKLJ.png)


![](https://i.imgur.com/P2NCgBx.png)


II.	HISTORIA DE USUARIOS 

Historia de Usuario
Número: 1	Usuario : Administrador
Nombre: Gestionar Cuenta de Usuarios
Prioridad de Negocio: Alta	Puntos Estimados: 10
Riesgos en Desarrollo: Media	Interacción Asignada:
Descripción:

El usuario con el rol de administrador, una vez que recibe el correo de confirmación por parte de la gerencia al empleado, en el cual se tiene un código de id único, en los que el administrador puede gestionar las cuentas actualizando datos y dando de baja a los usuarios.

Observaciones:

El código de empleado es un identificador único el cual pertenece a un usuario y no puede repetir, ni cuando al mismo se haya dado de baja en el sistema.












III.	

Historia de Usuario
Número: 2	Usuario : Administrador
Nombre: Registro - Control de Vehículos
Prioridad de Negocio: Alta	Puntos Estimados: 10
Riesgos en Desarrollo: Media	Interacción Asignada:
Descripción:

El usuario con el rol de administrador, se encarga de registrar los vehículos con los que cuenta el poder judicial, con un identificador único, número de placa, marca y modelo, Km en el que le permite agregar y editar e eliminar un vehículo.

Observaciones:

El código es un identificador único al igual que la placa del vehículo, es importante considerar los Km recorridos que lleva una unidad vehicular es tomada en cuenta para la asignación de combustible.




IV.	



Historia de Usuario
Número: 3	Usuario : Administrador
Nombre: Registro de Empleados
Prioridad de Negocio: Alta	Puntos Estimados: 11
Riesgos en Desarrollo: Media	Interacción Asignada: 2
Descripción:

El usuario con el rol de administrador, podrá agregar los datos del empleado ya sea conductor o los empleados de oficina (jueces, abogados y fiscales, personal administrativo) como nombres y apellidos del empleado en un varchar (100), correo electrónico en este caso es el correo corporativo, que me permita modificar los datos e inhabilitar el personal del sistema.

Observaciones:
En el módulo de registro de los empleados se tendrá en cuenta a los empleados que se les está dando de baja en mantener su código_id ya que este identificador es único.

V.	











Historia de Usuario
Número: 2	Usuario : Registrador
Nombre: Registro de Salida e Ingreso de los Vehículos
Prioridad de Negocio: Alta	Puntos Estimados: 25
Riesgos en Desarrollo: Media	Interacción Asignada:
Descripción:

El usuario podrá registrar la salida e ingreso de vehículos de la sede central de la Corte Superior de Justicia de Piura, para detallar una salida de un vehículo se tendrá en cuenta el número de la placa del vehículo, el kilometraje de la unidad, el conductor asignado, el lugar de origen y destino, número de pasajeros, además del propósito del viaje de esta manera podemos agregar una salida y se podrá editar los datos ingresados en caso hayamos ingresado un dato incorrecto.
Observaciones:
Se tendrá en cuenta un campo estático en el caso de kilometraje de la unidad para tener en cuenta los kilómetros recorridos.


VI.	

Historia de Usuario
Número: 2	Usuario : Conductor
Nombre: Consultas de registro vehicular
Prioridad de Negocio: Media	Puntos Estimados: 7
Riesgos en Desarrollo: Media	Interacción Asignada: 4
Descripción:

El usuario sólo podrá consultar registros de las unidades asignadas a los diferentes conductores ingresando el número de placa.

Observaciones:


VII.	

Historia de Usuario
Número: 2	Usuario : Cajero/ Logistica
Nombre: Registrar vale de consumo - Com  bustible
Prioridad de Negocio: Alta	Puntos Estimados: 24
Riesgos en Desarrollo: Media	Interacción Asignada:
Descripción:

El usuario puede emitir vales de pago ya sea por importe (soles) o la cantidad de combustible (litro), se tendrá en cuenta el tipo de combustible (DIESEL), además del número de placa que es la unidad vehicular a la que se le está asignando, registrar y asignar vale de consumo a conductores (quienes están amarrados al número de placa).

Observaciones:

Tener en cuenta que el registro de los vales de combustible están asignados a un número de placa y está a su vez va ligada a un conductor de cada unidad vehicular que le está asignada.

Cuadro  de Resumen de Historias de Usuario:

![](https://i.imgur.com/Uds1z9d.png)


TOTAL DE PUNTOS: 63
Estado del proyecto: 71 %


PROBLEMAS ENCONTRADOS EN EL DESARROLLO: 

![](https://i.imgur.com/NfBEamN.png)


Diseño de BASE DE DATOS ESTRUCTURADA


![](https://i.imgur.com/ybqyOrc.png)

BD FIREBASE

![](https://i.imgur.com/cMfJ5jI.png)

![](https://i.imgur.com/yDvoXFq.png)

![](https://i.imgur.com/h2Ajvm5.png)










PANTALLAS

![](https://i.imgur.com/xOe5PbJ.png)

![](https://i.imgur.com/FpCeRmY.png)

![](https://i.imgur.com/JbTkWdm.png)

![](https://i.imgur.com/3qX5ZAd.png)

![](https://i.imgur.com/7DreFi9.png)

![](https://i.imgur.com/fKA2nj0.png)
