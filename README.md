# Proyect Nisum

El proyecto es una aplicaci贸n web para la creaci贸n de usuarios

## Comenzando 馃殌

1. El proyecto se encuentra compartido en Github-> https://github.com/AlejoEsteban07/ProyectNisum


### Pre-requisitos 馃搵

- IDE de desarrollo para el back Spring Tools Suite 4
- Java 1.8 o posterior


### Instalaci贸n 馃敡

1. Descargar el back de la aplicaci贸n desde Github
2. Abrir o importar el back del proyecto desde el IDE de desarrollo. Es un proyecyo Maven.
3. Descargar de Maven las librerias que la aplicaci贸n requiera (Clean and Build)
4. Sobre la raiz del proyecto dar click derecho Run As -> Spring Boot App. Esto permitira subir el servidor de la aplicaci贸n.
5. La informaci贸n se almacena en la BD H2 en memoria

La aplicaci贸n no cuenta con data de Usuarios creados.


## Ejecutando las pruebas 鈿欙笍

1. Desde Postman enviar la solicitud del servicio de la siguiente manera:
	- Serivicio Post
	- En la Url: http://localhost:8080/user/registration
	- En el Body:
		{
			"name": "Juan Rodriguez",
			"email": "juan@rodriguez.org",
			"password": "Hunter2",
			"phone": [
				{
				"number": "1234567",
				"citycode": "1",
				"contrycode": "57"
				}
			]
		}
	- Consumir el servicio (Send)
2. Se puede validar la informaci贸n desde la url de la BD: 
   	- http://localhost:8080/h2-console
	- usuario: sa
	- password: 

## Despliegue 馃摝

El proyecto cuenta con un servidor embebido (Tomcat) para realizar el respectivo despliegue del back

## Construido con 馃洜锔?

* [Spring Tools Suite 4](https://spring.io/blog/2022/06/15/spring-tools-4-15-0-released) - IDE usado
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Github](https://github.com/)
* [H2]


## Versionado 馃搶

Use [Github](https://github.com/) para el versionado. Para todas las versiones disponibles, mira los [tags en este repositorio] https://github.com/AlejoEsteban07/ProyectNisum

## Autores 鉁掞笍


* **Neby Alejandro Esteban** - *Trabajo Inicial* 


## Licencia 馃搫

Este proyecto est谩 bajo Licencia libre
