package p1;

public class Product {
	int id;
	String name;

	public Product() {

		this.id = 0;
		this.name = "not given";
	}

       public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
