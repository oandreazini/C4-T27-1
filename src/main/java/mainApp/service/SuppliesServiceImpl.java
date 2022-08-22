package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mainApp.dao.ISuppliesDAO;
import mainApp.dto.Supplies;


@Service
public class SuppliesServiceImpl implements ISuppliesService{
	
	// Utilizamos los metodos de la interface ISuppliesDAO, es como si instaciaramos.
	@Autowired
	ISuppliesDAO iSuppliesDAO;
	
	
	@Override
	public List<Supplies> listSupplies() {
		
		return iSuppliesDAO.findAll();
	}

	@Override
	public Supplies saveSupplies(Supplies p) {

		return iSuppliesDAO.save(p);
	}

	@Override
	public Supplies suppliesXID(Integer id) {
		
		return iSuppliesDAO.findById(id).get();
	}

	@Override
	public Supplies updateSupplies(Supplies p) {

		return iSuppliesDAO.save(p);
	}

	@Override
	public void deleteSupplies(Integer id) {
		iSuppliesDAO.deleteById(id);		
	}

}
