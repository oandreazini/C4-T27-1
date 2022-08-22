package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IPiecesDAO;
import mainApp.dto.Pieces;

@Service
public class PiecesServiceImpl implements IPiecesService {

	// Utilizamos los metodos de la interface IPiecesDAO, es como si instaciaramos.
	@Autowired
	IPiecesDAO iPiecesDAO;
	
	@Override
	public List<Pieces> listPieces() {
		
		return iPiecesDAO.findAll();
	}

	@Override
	public Pieces savePieces(Pieces pieces) {
		
		return iPiecesDAO.save(pieces);
	}

	@Override
	public Pieces piecessXID(Integer id) {
		
		return iPiecesDAO.findById(id).get();
	}

	@Override
	public Pieces updatePieces(Pieces pieces) {
	
		return iPiecesDAO.save(pieces);
	}

	@Override
	public void deletePieces(Integer id) {
		iPiecesDAO.deleteById(id);
		
	}

}
