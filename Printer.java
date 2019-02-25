package lab2;

import java.util.Scanner;

public class Printer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue printerQueue = new Queue();
		String input="";
		while((true)){
			input=s.next();
			if((input.equals("exit"))){	
				break;
			}
			else{
				//System.out.println(input);
				int i=Integer.parseInt(input);
				Node n = new Node(i,null);
				printerQueue.enqueue(n);
			}
		}
		//System.out.println(printerQueue.size());
			
		while(printerQueue.size()>0){
			
			System.out.println(printerQueue.front().getValue());
			printerQueue.dequeue();
			if(printerQueue.isEmpty()){
				System.out.println("The queue is empty");
			}
		}

	}

}
