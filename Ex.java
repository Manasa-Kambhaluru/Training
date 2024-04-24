package basic;

import java.util.Objects;

class Laptop {
	int model;
	String name;

	@Override
	public int hashCode() {
		return Objects.hash(model, name);
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return model == other.model && Objects.equals(name, other.name);
	}
	
}

public class Example {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.model = 1006;
		laptop1.name = "Lenovo";
		
		Laptop laptop2 = new Laptop();
		laptop2.model = 1006;
		laptop2.name = "Lenovo";
		
		boolean result = laptop1.equals(laptop2);

		System.out.println(result);
		System.out.println(laptop1.toString());
		System.out.println(laptop1.hashCode());
	}

}


