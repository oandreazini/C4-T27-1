package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Providers;

public interface IProvidersDAO extends JpaRepository<Providers, Integer> {

}
