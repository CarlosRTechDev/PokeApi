# PokeApi - Restful WS
API RESTful que consume la API de POKEMON, también se utiliza la base de datos H2 para hacer peticiones GET/POST de manera local.

## Importar Proyecto PokeAPI (parte 1)
Para importar se debe dar clic derecho del mouse y seleccionar la opción Import.
![Captura de pantalla (1)](https://user-images.githubusercontent.com/76266019/122136173-8bc57a80-ce07-11eb-82f6-e4c9d5b866e0.png)

## Importar Proyecto PokeAPI (parte 2)
Después se abre una ventana y se debe seleccionar Existing Maven Project y dar clic en Next.
![Captura de pantalla (2)](https://user-images.githubusercontent.com/76266019/122136585-65540f00-ce08-11eb-8490-60b75080a388.png)

## Importar Proyecto PokeAPI (parte 3)
Seleccionar la ruta del directorio del proyecto que se quiere importar y luego seleccionar el archivo pom.xml que se carga por defecto.
![Captura de pantalla (3)](https://user-images.githubusercontent.com/76266019/122136610-6f760d80-ce08-11eb-8fc2-692c46e79e75.png)

## Ejecutar Proyecto
Una vez cargado el proyecto se debe dar clic derecho sobre el mismo y seleccionar Run As y después Spring Boot App. 
![Captura de pantalla (4)](https://user-images.githubusercontent.com/76266019/122136643-7dc42980-ce08-11eb-9f1f-87d991f4073c.png)

## Página principal: localhost:8080/help
Cuando compila la aplicación esta es la página principal en la que se muestran los datos del desarrollador junto con una tabla de los servicios que se consumen.
![Captura de pantalla (5)](https://user-images.githubusercontent.com/76266019/122136659-8583ce00-ce08-11eb-9ebe-52f348205f91.png)


## Mostrar 721 Pokemon (6ta generación)
Al dar clic a la URL http://localhost:8080/poke-cliente/pokemon este es un cliente que consume la URL de PokeApi, devuelve los datos en formato JSON, sólo tiene parametros de number, name y url del pokemon.
![Captura de pantalla (6)](https://user-images.githubusercontent.com/76266019/122137685-d72d5800-ce0a-11eb-9b6b-82e92858aebf.png)

## Buscar por nombre o id
Al dar clic a la URL http://localhost:8080/poke-cliente/pokemon/mewtwo este es un cliente que consume la URL de PokeApi, si se ingresa un pokemon o su id al final de la url devuelve un resultado del mismo con los parametros id, name, types.
![Captura de pantalla (7)](https://user-images.githubusercontent.com/76266019/122137696-ddbbcf80-ce0a-11eb-84e5-1fc1c5228d38.png)

## Guardar Pokemon en la Base de Datos H2
Con la herramienta Postman se puede hacer el envío de peticiones HTTP REST, en este caso se utiliza POST y se agrega la URL: localhost:8080/pokemon-db/pokemon/ para guardar a un pokemon en la Base de Datos H2. Para guardar a un nuevo Pokemon se debe dar clic en Body y escribir los parametros nombre, apodo, especie, tipos, numeroPoke. De manera aleatoria guarda los parametros de ataque, defensa y salud en un rango de 0 a 15.
![Captura de pantalla (8)](https://user-images.githubusercontent.com/76266019/122137711-e6aca100-ce0a-11eb-9073-c995e1333728.png)

## Pokemon capturado!
Una vez ingresados los datos del pokemon a guardar manda el mensaje de "Pokemon captudado!"
![Captura de pantalla (9)](https://user-images.githubusercontent.com/76266019/122137726-ee6c4580-ce0a-11eb-9438-c3e359a218dc.png)

##  Peticion GET del Pokemon guardado en la Base de Datos
Para comprobar que el pokemon se guardó en la base se puede hacer una peticion GET con la URL http://localhost:8080/pokemon-db/pokemon/apodo/ y se debe escribir el apodo del pokemon y devuelve los datos del mismo y muestra los datos aleatorios de ataque, defensa y salud.
![Captura de pantalla (10)](https://user-images.githubusercontent.com/76266019/122137733-f330f980-ce0a-11eb-85a7-e46a756bb946.png)

## Buscar Pokemon por apodo
Al final de la URL http://localhost:8080/pokemon-db/pokemon/apodo/Charlyzard se debe agregar el apodo del pokemon (Charlyzard), muestra al pokemon por apodo desde localhost con sus datos como son id, nombre, apodo, especie, etc.
![Captura de pantalla (11)](https://user-images.githubusercontent.com/76266019/122137747-faf09e00-ce0a-11eb-8a7e-1acc55cc8440.png)

## Buscar Pokemon por especie
Al final de la URL http://localhost:8080/pokemon-db/pokemon/especie/Llama se debe agregar la especie del pokemon (Llama) a buscar y devolverá a todos los pokemon que tengan la misma especie
![Captura de pantalla (12)](https://user-images.githubusercontent.com/76266019/122139892-96840d80-ce0f-11eb-855c-2f9badd8ab96.png)

## Muestra a todos los Pokemon de la Base de Datos H2
En esta URL http://localhost:8080/pokemon-db/pokemon se muestran a todos los pokemon de la base, la tabla y los registros ya estan precargados en el proyecto, en data.sql.
![Captura de pantalla (13)](https://user-images.githubusercontent.com/76266019/122139899-9ab02b00-ce0f-11eb-8b54-17d5d24b426b.png)

## Consola de la Base de Datos H2
Con esta URL http://localhost:8080/h2-console redirecciona a la consola H2 y se deben agregar los siguientes datos para ingresar a la base... JDBC URL: jdbc:h2:mem:testdb
user: sa
password: sa
![Captura de pantalla (15)](https://user-images.githubusercontent.com/76266019/122139918-a4d22980-ce0f-11eb-873b-79a3d712c5fa.png)

## Tabla Pokemon2 con registros
Con el archivo data.sql se agregan los registros de manera automatica en la tabla. Nota: H2 es una base de datos volatil por lo que sólo mostrará los registros precargados, sólo almacena de manera temporal cuando la aplicación esta en ejecución.
![Captura de pantalla (16)](https://user-images.githubusercontent.com/76266019/122139929-aa2f7400-ce0f-11eb-9a6e-bdfc70c800b6.png)


