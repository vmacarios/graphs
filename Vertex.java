
public class Vertex {
	String label;
	Vertex(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (this == o)
			return true;
		
		return ((o instanceof Vertex) && (((Vertex) o).getLabel() == this.label)) ? true : false;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		
		result = 31 * result + label.hashCode();
		
		return result;
		
	}
	
	@Override
	public String toString() {
		return label;
	}
}
