import java.util.*;

public class Graph {
	private List<Node> nodes;
	private List<Edge> edges;
	
	public List<Node> getNodes() {
		return nodes;
	}
	
	public Graph(List<Node> nodes, List<Edge> edges) {
		this.nodes = nodes;
		this.edges = edges;
	}
	 
	public Graph(int i) {
		// TODO Auto-generated constructor stub
	}

	public List<Edge> getEdgesFromNode(Node node){
		List<Edge> edgesFromNode = new ArrayList<>();
		
		for (Edge edge : edges) {
			if (edge.getSourceNode().equals(node)) 
				edgesFromNode.add(edge);
		}
		
		return edgesFromNode;
	}
	
	public int getTotalNodes() {
		return nodes.size();
	}
	
	public Node getNodeById(int id) {
		return nodes.get(id);
	}

	public void addEdge(int sourceNodeId, int destNodeId, int weight) {
	    Node sourceNode = nodes.get(sourceNodeId);
	    Node destNode = nodes.get(destNodeId);
	    Edge edge = new Edge(sourceNode, destNode, weight);
	    edges.add(edge);
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
}

//getedgeFromNode restituisce una lista di tutti gli archi che partono dal nodo che gli passiamo
