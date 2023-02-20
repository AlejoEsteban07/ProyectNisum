# Proyect Nisum

El proyecto es una aplicación web para la creación de usuarios

## Comenzando 🚀

1. El proyecto se encuentra compartido en Github-> https://github.com/AlejoEsteban07/ProyectNisum


### Pre-requisitos 📋

- IDE de desarrollo para el back Spring Tools Suite 4
- Java 1.8 o posterior


### Instalación 🔧

1. Descargar el back de la aplicación desde Github
2. Abrir o importar el back del proyecto desde el IDE de desarrollo. Es un proyecyo Maven.
3. Descargar de Maven las librerias que la aplicación requiera (Clean and Build)
4. Sobre la raiz del proyecto dar click derecho Run As -> Spring Boot App. Esto permitira subir el servidor de la aplicación.

La aplicación no cuenta con data de Usuarios creados.


## Ejecutando las pruebas ⚙️

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


## Despliegue 📦

El proyecto cuenta con un servidor embebido (Tomcat) para realizar el respectivo despliegue del back

## Construido con 🛠️

* [Spring Tools Suite 4](https://spring.io/blog/2022/06/15/spring-tools-4-15-0-released) - IDE usado
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Github](https://github.com/)


## Versionado 📌

Use [Github](https://github.com/) para el versionado. Para todas las versiones disponibles, mira los [tags en este repositorio] https://github.com/AlejoEsteban07/ProyectNisum

## Autores ✒️


* **Neby Alejandro Esteban** - *Trabajo Inicial* 


## Licencia 📄

Este proyecto está bajo Licencia libre