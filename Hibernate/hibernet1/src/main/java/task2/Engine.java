package task2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
	private int id;
	private int cc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Engine() {
		super();
	}

}
