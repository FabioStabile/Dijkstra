
public class Node {
	private int id; //indica il valore del nodo
	private int path; //in path inseriremo la distanza più breve dal nodo di partenza
	
	public Node(int id) {
		this.id = id;
		this.path = Integer.MAX_VALUE; //Lo impostiamo così per far capire che il nodo non è ancora stato visitato, quando trova un percorso più breve la variabile viene aggiornata
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}
	
}
