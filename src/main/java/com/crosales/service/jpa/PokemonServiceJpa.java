package com.crosales.service.jpa;

import java.util.List;
import java.util.Random;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crosales.entity.Pokemon2;
import com.crosales.entity.PokemonRespuesta;
import com.crosales.entity.PokemonRespuesta2;
import com.crosales.repository.PokemonRepository;
import com.crosales.service.IPokemonService;



@Service
public class PokemonServiceJpa implements IPokemonService {

	/* Se inyecta la interface PokemonRepository para usar los Query Methods */ 
	@Autowired
	private PokemonRepository repoPokemon;
	
	
	
	/* Se Sobrescribe el metodo buscarTodos() de la interfaz PokemonService y 
	 * con findAll() devuelve todos los objetos de tipo Pokemon2 en una lista
	 */
	@Override
	public List<Pokemon2> buscarTodos() {
		return repoPokemon.findAll(); 
	}

	/* Se Sobrescribe el metodo buscarPorApodo() de la interfaz PokemonService y 
	 * con findByApodo() devuelve el apodo de los Pokemon en una lista
	 */
	@Override
	public List<Pokemon2> buscarPorApodo(String apodo) {
		return repoPokemon.findByApodo(apodo);
	}

	/* Se Sobrescribe el metodo buscarPorEspecie() de la interfaz PokemonService y 
	 * con findByEspecie() devuelve todas las especies de los Pokemon en una lista
	 */
	@Override
	public List<Pokemon2> buscarPorEspecie(String especie) {
		return repoPokemon.findByEspecie(especie);
	}
	
	/* Guarda a un Pokemon (sin uso)*/
//	@Override
//	public void guardar(Pokemon2 pokemon) {
//		repoPokemon.save(pokemon);
//	}
	
	
	/*
	 * GUARDAR DATOS ALEATORIOS DE UN POKEMON
	 * Con Random tenemos numeros aleatorios y estos se le asignan a un dato de tipo Int para definir el rango entre 0 y 15.
	 * En el objeto de tipo Pokemon2 se configuran ataque, defensa, salud y se le asignan los valores de atkAleatorio, defAleatorio, hpAleatorio.
	 * Con save() se guarda el objeto Pokemon2 con los numeros aleatorios. 
	 */
	@Override
	public void guardarPokeAleatorio(Pokemon2 pokemon) {
		Random r = new Random();
		int atkAleatorio = r.nextInt(16)+0;  // Ataque aleatorio entre 0 y 15. 
		int defAleatorio = r.nextInt(16)+0;  // Defensa aleatorio entre 0 y 15. 
		int hpAleatorio = r.nextInt(16)+0;  // Salud aleatorio entre 0 y 15. 
		
		pokemon.setAtaque(atkAleatorio);
		pokemon.setDefensa(defAleatorio);
		pokemon.setSalud(hpAleatorio);
		repoPokemon.save(pokemon);
	}

	/* MUESTRA A LOS 721 POKEMON (hasta 6ta generacion).
	 * Para acceder a la URL de la API primero se debe configurar el HttpClient y el RestTemplate para usar el certificado SSL para la peticion, para
	 * hacer eso se debe agregar la dependencia Apache HttpClient en el pom.xml
	 * y se debe agregar el objeto PokemonRespuesta en el que mapean los datos del Array o List, y este Array contine objetos de tipo PokemonAPI.
	 * El resultado de la URL (Ejemplo: https://pokeapi.co/api/v2/pokemon?limit=721) solo devuelve parametros name y url. 
	 */
	@Override
	public PokemonRespuesta traerTodosPokeApi() {
		CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        PokemonRespuesta poke = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?limit=721", PokemonRespuesta.class);
        return poke;
	}

	
	/* BUSCAR POKEMON POR NOMBRE O ID.
	 * Para acceder a la URL de la API primero se debe configurar el HttpClient y el RestTemplate para usar el certificado SSL para la peticion, para
	 * hacer eso se debe agregar la dependencia Apache HttpClient en el pom.xml
	 * y se debe agregar el objeto PokemonRespuesta2 en el que mapean los datos del Array o List.
	 * El resultado de la URL (Ejemplo: https://pokeapi.co/api/v2/pokemon/pikachu) es diferente de la URL de arriba ya que 
	 * esta devuelve un conjunto de parametros como lista de habilidades, formas, movimientos, etc. pero sólo se usarán
	 * id, ArrayList<PokemonAPI2> y ArrayList<Types>  
	 */
	@Override
	public PokemonRespuesta2 buscarPorNombreIdPoke(String name){
		CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        PokemonRespuesta2 poke = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/"+name, PokemonRespuesta2.class);
        return poke;
	}


	

	

	
}
