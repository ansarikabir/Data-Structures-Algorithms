package lab2;

public class LinkedList {

	private Node firstNode = null;
	private Node lastNode = null;
	private int size;

	public void addFirst(Node e) {
		Node n = new Node(e.getValue(), null);
		n.setNext(firstNode);
		firstNode = n;
		size++;
	}

	public Node removeFirst() {
		Node temp = firstNode;
		firstNode = firstNode.getNext();
		size--;
		return temp;

	}

	public Node addLast(Node e) {
		Node n = new Node(e.getValue(), null);
		if (lastNode == null) {
			firstNode = n;
			lastNode = n;
			size++;
			return n;
		} else {
			n.setNext(null);
			lastNode.setNext(n);
			lastNode = n;
			size++;
			return n;
		}
	}

	public void removeLast() {
		Node curr = null;

		for (curr = this.firstNode; curr.getNext().getNext() != null; curr = curr.getNext()) {

		}

		lastNode = null;
		lastNode = curr;
		size--;
	}

	public Node getFirst() {
		return this.firstNode;
	}

	public Node getLast() {
		return this.lastNode;
	}

	public int size() {
		return size;
	}

}
