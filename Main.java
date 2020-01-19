
public class Main {

	public static void main(String[] args) {
	
		Graph graph = new Graph();
		graph.addVertex("Bob");
		graph.addVertex("Alice");
		graph.addVertex("Mark");
		graph.addVertex("Rob");
		graph.addVertex("Maria");
		graph.addEdge("Bob", "Alice");
		graph.addEdge("Bob", "Rob");
		graph.addEdge("Alice", "Mark");
		graph.addEdge("Rob", "Mark");
		graph.addEdge("Alice", "Maria");
		graph.addEdge("Rob", "Maria");
		
		
		System.out.println(graph.printGraph());		
		
		System.out.println(Traversal.depthFirstTraversal(graph, "Rob"));
		
		System.out.println(Traversal.breadthFirstTraversal(graph, "Maria"));	

	}

}
