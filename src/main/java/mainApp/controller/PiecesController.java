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

import mainApp.dto.Pieces;
import mainApp.service.PiecesServiceImpl;

@RestController
@RequestMapping("/api")
public class PiecesController {
	
	@Autowired
	PiecesServiceImpl piecesServideImpl;
	
	@GetMapping("/pieces")
	public List<Pieces> listPieces() {
		return piecesServideImpl.listPieces();
	}

	@PostMapping("/pieces")
	public Pieces savePieces(@RequestBody Pieces pieces) {

		return piecesServideImpl.savePieces(pieces);
	}

	@GetMapping("/pieces/{id}")
	public Pieces piecessXID(@PathVariable(name = "id") int id) {
	
		return piecesServideImpl.piecessXID(id);

	}

	@PutMapping("/pieces/{id}")
	public Pieces updatePieces(@PathVariable(name = "id") int id, @RequestBody Pieces pieces) {

		Pieces pieces_select;
		Pieces pieces_update;

		pieces_select = piecesServideImpl.piecessXID(id);
		
		pieces_select.setName(pieces.getName());
		pieces_select.setSupplies(pieces.getSupplies());

		pieces_update = piecesServideImpl.updatePieces(pieces_select);

		System.out.println("El pieces actualizado es: " + pieces_update);

		return pieces_update;
	}

	@DeleteMapping("/pieces/{id}")
	public void deletePieces(@PathVariable(name = "id") int id) {
		piecesServideImpl.deletePieces(id);
	}

}

