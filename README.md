# T�tulo del Proyecto

Talller 1 - AREP 

Introduction To Computer System Design

 [![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://arep-taller-4.herokuapp.com/)
 

## Comenzando 

Para tener una copia del repositorio, desde consola ejecute el siguiente comando.

```
git clone https://github.com/JuanCe11/AREP-Taller-4.git
```

### Pre-requisitos 

- Java 8 - [How install](https://www.java.com/es/download/help/windows_manual_download.xml)
- Git - [How install](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git)
- Maven - [How install](https://maven.apache.org/install.html)


### Instalaci�n 

Para la correcta instalaci�n se debe primero clonar el repositorio como se indic� anteriormente, despu�s se ingresa al directorio del proyecto y para ejecutar la clase App (el servicio web) se ejecutan los siguientes comandos en windows.

```
cd AREP-Taller-4
mvn package
java -cp target/classes;target/dependency/* co.edu.escuelaing.taller4.microSpring.MicroSpringBoot co.edu.escuelaing.taller4.microSpring.HelloController
```
Para sistemas linux usar: 

```
cd AREP-Taller-Taller4
mvn package
java -cp target/classes:target/dependency/* co.edu.escuelaing.taller4.microSpring.MicroSpringBoot co.edu.escuelaing.taller4.microSpring.HelloController
```
Cuando se tenga el servicio corriendo se ingresa a la direccion http://localhost:4567/ para ver el el servicio en el navegador.

Puede revisar las fuentes del proyecto revisar a detalle los test.

Puede generar la docuementacion usando:

```
mvn javadoc:javadoc
```

## Ejecutando las pruebas 

Ahora para ejecutar los test se utiliza el comando:

```
mvn test
```

## Construido con 

* [Java 8](https://www.java.com/es/about/whatis_java.jsp)
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spark Java](http://sparkjava.com/) - Framework de aplicaci�n web.


## Wiki

Puedes encontrar mucho m�s de c�mo utilizar este proyecto en nuestra [Wiki](https://github.com/JuanCe11/AREP-Taller-Heroku/wiki)


## Autores 

* **Juan Sebastia G�mez L�pez** - *Trabajo Inicial* - [JuanCe11](https://github.com/JuanCe11)


## Licencia

Este proyecto est� bajo la Licencia GNU General Public License - mira el archivo [LICENSE.txt](LICENSE.txt) para detalles

