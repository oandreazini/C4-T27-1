package mainApp.service;

import java.util.List;

import mainApp.dto.Providers;

public interface IProvidersService {

	//Metodos del CRUD
	public List<Providers> listProviders(); //Listar All 

	public Providers saveProviders(Providers providers);	//Guarda un Providers CREATE

	public Providers providersXID(Integer id); //Leer datos de un Providers READ

	public Providers updateProviders(Providers providers); //Actualiza datos del Providers UPDATE

	public void deleteProviders(Integer id);// Elimina el Providers DELETE
}
