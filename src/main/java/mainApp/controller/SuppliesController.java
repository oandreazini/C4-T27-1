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

import mainApp.dto.Supplies;
import mainApp.service.SuppliesServiceImpl;


@RestController
@RequestMapping("/api")
public class SuppliesController {
	
	@Autowired
	SuppliesServiceImpl suppliesServiceImpl;
	
	@GetMapping("/supplies")
	public List<Supplies> listSupplies() {
		return suppliesServiceImpl.listSupplies();
	}

	@PostMapping("/supplies")
	public Supplies saveSupplies(@RequestBody Supplies supplies) {

		return suppliesServiceImpl.saveSupplies(supplies);
	}

	@GetMapping("/supplies/{id}")
	public Supplies suppliesXID(@PathVariable(name = "id") int id) {
	
		return suppliesServiceImpl.suppliesXID(id);

	}

	@PutMapping("/supplies/{id}")
	public Supplies updateSupplies(@PathVariable(name = "id") int id, @RequestBody Supplies supplies) {

		Supplies supplies_select;
		Supplies supplies_update;

		supplies_select = suppliesServiceImpl.suppliesXID(id);
		
		supplies_select.setPieces(supplies.getPieces());
		supplies_select.setProviders(supplies.getProviders());
		supplies_select.setPrice(supplies.getPrice());
		
		supplies_update = suppliesServiceImpl.updateSupplies(supplies_select);

		System.out.println("El supplies actualizado es: " + supplies_update);

		return supplies_update;
	}

	@DeleteMapping("/supplies/{id}")
	public void deleteSupplies(@PathVariable(name = "id") int id) {
		suppliesServiceImpl.deleteSupplies(id);
	}

}
