import java.util.*;

public class Dijkstra {
	private int[] distances; //memorizza la distanza minima dal nodo di partenza a ciascun nodo del grafo
	private int[] previousNodes; //memorizza il nodo precedente con la strada più breve
	private boolean[] visitedNodes; //indica se un nodo è stato visitato o no
	private PriorityQueue<Node> unvisitedNodes; //contiene i nodi non ancora visitati, sono ordinati in base alla distanza dal nodo di partenza quindi quelli più vicini hanno la priorità
	private Graph graph; //il grafo su cui verrà eseguito l'algoritmo
	
	public Dijkstra(Graph graph) {
		this.graph = graph;
	}
	
	public void findShortestPath(Node start) {
		int totalNodes = graph.getTotalNodes();
		
		distances = new int[totalNodes];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[start.getId()] = 0;
		
		previousNodes = new int[totalNodes];
		Arrays.fill(previousNodes, -1);
		
		visitedNodes = new boolean[ totalNodes];
		
		unvisitedNodes = new PriorityQueue<>(Comparator.comparingInt(Node::getPath));
		unvisitedNodes.add(start);
		
		while(!unvisitedNodes.isEmpty()) {
			Node tmp = unvisitedNodes.poll();
			visitedNodes[tmp.getId()] = true;
			
			for(Edge edge : graph.getEdgesFromNode(tmp)) {
				Node destination = edge.getDestinationNode();
				int distance = edge.getDistance();
				int path = distances[tmp.getId()] + distance;
				
				if(!visitedNodes[destination.getId()]) {
					if(unvisitedNodes.contains(destination)) {
						distances[destination.getId()] = path;
						previousNodes[destination.getId()] = tmp.getId();
						unvisitedNodes.add(destination);
					}else if(path < distances[tmp.getId()]) {
						distances[destination.getId()] = path;
						previousNodes[destination.getId()] = tmp.getId();
					}
				}
			}
		}
			
	}
	
	public List<Node> getShortestPath(Node end){
		List<Node> totalDistance = new ArrayList<>();
		int tmp = end.getId();
		
		while(previousNodes[tmp] != -1) {
			totalDistance.add(0, graph.getNodeById(tmp));
			tmp = previousNodes[tmp];
		}
		
		totalDistance.add(0, graph.getNodeById(tmp));
		
		return totalDistance;
	}
	
	public int getShortestDistance(Node end) {
		return distances[end.getId()];
	}
	
}
