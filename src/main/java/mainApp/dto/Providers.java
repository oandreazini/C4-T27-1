package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "providers") // en caso que la tabla sea diferente
public class Providers {
		
		// Atributos de entidad proveedores
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
		private int id;
		@Column(name = "name") // no hace falta si se llama igual
		private String name;
		
		@OneToMany
	    @JoinColumn(name="id")
	    private List<Supplies> supplies;
		
		//Constructores
		
		public Providers() {
		}

		/**
		 * 
		 * @param id
		 * @param name
		 * @param supplies
		 */
		public Providers(int id, String name, List<Supplies> supplies) {
			super();
			this.id = id;
			this.name = name;
			this.supplies = supplies;
		}

		// Getters & Setters
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Supplies")
		public List<Supplies> getSupplies() {
			return supplies;
		}

		public void setSupplies(List<Supplies> supplies) {
			this.supplies = supplies;
		}

		//Metodo toString
		
		@Override
		public String toString() {
			return "Providers [id=" + id + ", name=" + name + ", supplies=" + supplies + "]";
		}

}
