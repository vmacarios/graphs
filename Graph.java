import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private Map<Vertex, List<Vertex>> adjVertices;
	public Graph() {
		this.adjVertices = new HashMap<Vertex, List<Vertex>>();
	}

	void addVertex(String name) {
		adjVertices.putIfAbsent(new Vertex(name), new ArrayList<>());
	}

	void removeVertex(String name) {
		Vertex v = new Vertex(name);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(name));
	}

	void addEdge(String name1, String name2) {
		Vertex v1 = new Vertex(name1);
		Vertex v2 = new Vertex(name2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}

	void removeEdge(String name1, String name2) {
		Vertex v1 = new Vertex(name1);
		Vertex v2 = new Vertex(name2);
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	List<Vertex> getAdjVertices(String name) {
		return adjVertices.get(new Vertex(name));
	}

	String printGraph() {
		StringBuffer sb = new StringBuffer();
		for(Vertex v : adjVertices.keySet()) {
			sb.append(v);
			sb.append(adjVertices.get(v));
			sb.append("\n");
		}
		return sb.toString();
	}
}