DROP TABLE IF EXISTS pokemon2;

CREATE TABLE pokemon2 (
  id INT AUTO_INCREMENT PRIMARY KEY,
  numero_poke int,
  nombre VARCHAR(20),
  apodo VARCHAR(25),
  especie VARCHAR(20),
  ataque INT,
  defensa INT,
  salud INT,
  tipos VARCHAR(30) 
);


insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(1, '001','Bulbasaur','Bulbas','Semilla',10,8,8,'Planta/Veneno');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(2, '002','Ivysaur','Ivys','Semilla',12,10,10,'Planta/Veneno');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(3, '003','Venusaur','Venus','Semilla',15,11,13,'Planta/Veneno');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(4, '004','Charmander','Flamita','Lagartija',8,9,8,'Fuego');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(5, '005','Charmeleon','Leon','Llama',9,11,9,'Fuego');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(6, '006','Charizard','Charlyzard','Llama',10,12,10,'Fuego/Volador');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(7, '007','Squirtle','Scuero','Tortuguita',7,9,9,'Agua');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(8, '008','Wartortle','Rafael','Tortuga',8,10,11,'Agua');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(9, '009','Blastoise','Caguama','Armazón',9,11,12,'Agua');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(10,'134','Vaporeon','Rainer','Burbuja',7,6,5,'Agua');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(11,'135','Jolteon','Sparky','Relámpago',5,5,6,'Eléctrico');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(12,'136','Flareon','Pyro','Llama',6,7,7,'Fuego');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(13,'134','Vaporeon','Rainer','Burbuja',7,6,5,'Agua');
insert into pokemon2 (id,numero_poke,nombre,apodo,especie,ataque,defensa,salud,tipos)values(14,'025','Pikachu','Pika','Ratón',8,8,8,'Eléctrico');
