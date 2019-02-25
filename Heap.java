package lab4;

public class Heap {
	
	 private static final int d = 2;
	 private int heapSize;
	 private int[] heap;
	 
	 public Heap(int capacity){
	        heapSize = 0;
	        heap = new int[capacity + 1];
	        
	    }
	 
	 public boolean isEmpty( )
	    {
	        return heapSize == 0;
	    }
	 
	 public void insert(int x)
	    {
	        heap[heapSize++] = x;
	        heapifyUp(heapSize - 1);
	    }
	 private void heapifyUp(int childInd)
	    {
	        int tmp = heap[childInd];    
	        while (childInd > 0 && tmp < heap[parent(childInd)])
	        {
	            heap[childInd] = heap[ parent(childInd) ];
	            childInd = parent(childInd);
	        }                   
	        heap[childInd] = tmp;
	    }
	 
	 private int parent(int i) 
	    {
	        return (i - 1)/d;
	    }
	 
	 public int min(){           
	        return heap[0];
	    }
	 public int removeMin(){
	        int keyItem = heap[0];
	        delete(0);
	        return keyItem;
	    }
	 
	  public int delete(int ind){
	        int keyItem = heap[ind];
	        heap[ind] = heap[heapSize - 1];
	        heapSize--;
	        heapifyDown(ind);        
	        return keyItem;
	    }
	  
	  private void heapifyDown(int ind)
	    {
	        int child;
	        int tmp = heap[ ind ];
	        while (kthChild(ind, 1) < heapSize)
	        {
	            child = minChild(ind);
	            if (heap[child] < tmp)
	                heap[ind] = heap[child];
	            else
	                break;
	            ind = child;
	        }
	        heap[ind] = tmp;
	    }
	  private int kthChild(int i, int k) 
	    {
	        return d * i + k;
	    }
	  private int minChild(int ind) 
	    {
	        int bestChild = kthChild(ind, 1);
	        int k = 2;
	        int pos = kthChild(ind, k);
	        while ((k <= d) && (pos < heapSize)) 
	        {
	            if (heap[pos] < heap[bestChild]) 
	                bestChild = pos;
	            pos = kthChild(ind, k++);
	        }    
	        return bestChild;
	    }
	  private int size(){
		  return this.heapSize;
	  }

}
