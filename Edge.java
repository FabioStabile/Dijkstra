
public class Edge {
	private Node sourceNode; //nodo di partenza
	private Node destinationNode; //nodo successivo
	private int distance; //distanza tra i due nodi
	
	public Edge(Node sourceNode, Node destinationNode, int distance) {
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		this.distance = distance;
	}

	public Node getSourceNode() {
		return sourceNode;
	}

	public void setSourceNode(Node sourceNode) {
		this.sourceNode = sourceNode;
	}

	public Node getDestinationNode() {
		return destinationNode;
	}

	public void setDestinationNode(Node destinationNode) {
		this.destinationNode = destinationNode;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}
