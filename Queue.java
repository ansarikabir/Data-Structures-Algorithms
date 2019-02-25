package lab2;

public class Queue {
	
	private LinkedList list= new LinkedList();
	
	public void enqueue(Node v){
		list.addLast(v);
	}
	
	public void dequeue(){
		list.removeFirst();
	}

	public Node front(){
		return list.getFirst();
	}
	
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return (list.getFirst() == null);
	}
}
