public class Vertex {
	String name;
	Vertex(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (this == o)
			return true;

		return (o instanceof Vertex) && (((Vertex) o).getName() == this.name);
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 31 * result + name.hashCode();

		return result;
	}

	@Override
	public String toString() {
		return name;
	}
}
