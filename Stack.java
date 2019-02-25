package lab2;


public class Stack {

	private LinkedList list= new LinkedList();
		
	public void push(Node c){
		list.addFirst(c);
		
	}
	
	public void pop(){	
		   list.removeFirst();
		    
	}
	public Node top(){
		return list.getFirst();
		
	}
	
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return (list.getFirst() == null);
	}
}
