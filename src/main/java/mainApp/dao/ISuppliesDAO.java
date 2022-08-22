package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Supplies;

public interface ISuppliesDAO extends JpaRepository<Supplies, Integer> {

}
