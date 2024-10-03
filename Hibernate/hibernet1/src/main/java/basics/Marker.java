package basics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marker {
	@Id
	private int id;
	private String brand;
	private double price;
	
	public Marker() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
