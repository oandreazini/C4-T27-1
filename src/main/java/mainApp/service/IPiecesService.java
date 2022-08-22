package mainApp.service;

import java.util.List;

import mainApp.dto.Pieces;


public interface IPiecesService {

	//Metodos del CRUD
	public List<Pieces> listPieces(); //Listar All 

	public Pieces savePieces(Pieces pieces);	//Guarda un Pieces CREATE

	public Pieces piecessXID(Integer id); //Leer datos de un Pieces READ

	public Pieces updatePieces(Pieces pieces); //Actualiza datos del Pieces UPDATE

	public void deletePieces(Integer id);// Elimina el Pieces DELETE

}
