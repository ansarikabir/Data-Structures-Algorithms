package lab2;


public class Node {
	private Object value;
	private Node next;
	
	public Node(Object value, Node nextNode){
		this.value = value;
		this.next = nextNode;
	}
	
	public Object getValue(){
		return value;
	}

	public Node getNext(){
		return next;
	}
	
	public void setValue(char value){
		this.value = value;
	}
	
	public void setNext(Node next){
		this.next = next;
	}

}
