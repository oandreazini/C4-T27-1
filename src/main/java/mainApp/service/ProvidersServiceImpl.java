package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProvidersDAO;
import mainApp.dto.Providers;

@Service
public class ProvidersServiceImpl implements IProvidersService {
	
	// Utilizamos los metodos de la interface IProvidersDAO, es como si instaciaramos.
	@Autowired
	IProvidersDAO iProvidersDAO;
	
	@Override
	public List<Providers> listProviders() {
	
		return iProvidersDAO.findAll();
	}

	@Override
	public Providers saveProviders(Providers providers) {
		
		return iProvidersDAO.save(providers);
	}

	@Override
	public Providers providersXID(Integer id) {
	
		return iProvidersDAO.findById(id).get();
	}

	@Override
	public Providers updateProviders(Providers providers) {
		
		return iProvidersDAO.save(providers);
	}

	@Override
	public void deleteProviders(Integer id) {
		iProvidersDAO.deleteById(id);
		
	}

}
