package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Pieces;

public interface IPiecesDAO extends JpaRepository<Pieces, Integer>{

}
