package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Providers;
import mainApp.service.ProvidersServiceImpl;


@RestController
@RequestMapping("/api")
public class ProvidersController {
	
	@Autowired
	ProvidersServiceImpl providersServiceImpl;
	
	@GetMapping("/providers")
	public List<Providers> listProviders() {
		return providersServiceImpl.listProviders();
	}

	@PostMapping("/providers")
	public Providers saveProviders(@RequestBody Providers providers) {

		return providersServiceImpl.saveProviders(providers);
	}

	@GetMapping("/providers/{id}")
	public Providers providersXID(@PathVariable(name = "id") int id) {
	
		return providersServiceImpl.providersXID(id);

	}

	@PutMapping("/providers/{id}")
	public Providers updateProviders(@PathVariable(name = "id") int id, @RequestBody Providers providers) {

		Providers providers_select;
		Providers providers_update;

		providers_select = providersServiceImpl.providersXID(id);
		
		providers_select.setName(providers.getName());
		providers_select.setSupplies(providers.getSupplies());
				
		providers_update = providersServiceImpl.updateProviders(providers_select);

		System.out.println("El proveedores actualizado es: " + providers_update);

		return providers_update;
	}

	@DeleteMapping("/providers/{id}")
	public void deleteProviders(@PathVariable(name = "id") int id) {
		providersServiceImpl.deleteProviders(id);
	}


}
