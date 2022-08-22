package mainApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "supplies") // en caso que la tabla sea diferente
public class Supplies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_pieces")
	private Pieces pieces;
	
	@ManyToOne
	@JoinColumn(name = "id_providers")
	private Providers providers;
	
	@Column(name = "price") 
	private int price;
	
	
	//Constructores

	public Supplies() {
	
	}
	
	/**
	 * 
	 * @param id
	 * @param pieces
	 * @param providers
	 * @param price
	 */
	public Supplies(int id, Pieces pieces, Providers providers, int price) {
		this.id = id;
		this.pieces = pieces;
		this.providers = providers;
		this.price = price;
	}
	
	//Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pieces getPieces() {
		return pieces;
	}

	public void setPieces(Pieces pieces) {
		this.pieces = pieces;
	}

	public Providers getProviders() {
		return providers;
	}

	public void setProviders(Providers providers) {
		this.providers = providers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//Metodo toString
	
	@Override
	public String toString() {
		return "Supplies [id=" + id + ", pieces=" + pieces + ", providers=" + providers + ", price=" + price + "]";
	}	
	
}
