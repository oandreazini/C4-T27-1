package mainApp.service;

import java.util.List;

import mainApp.dto.Supplies;

public interface ISuppliesService {

	//Metodos del CRUD
	public List<Supplies> listSupplies(); //Listar All 

	public Supplies saveSupplies(Supplies p);	//Guarda un Supplies CREATE

	public Supplies suppliesXID(Integer id); //Leer datos de un Supplies READ

	public Supplies updateSupplies(Supplies p); //Actualiza datos del Supplies UPDATE

	public void deleteSupplies(Integer id);// Elimina el Supplies DELETE

}
