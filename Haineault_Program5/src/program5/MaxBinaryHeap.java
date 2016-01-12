/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 5
 */

package program5;

import java.util.ArrayList;

public class MaxBinaryHeap {

	private ArrayList<Node> heap = new ArrayList<>();
	
	public MaxBinaryHeap()
	{
		
	}
	
	public MaxBinaryHeap(int[] nums)
	{
		for(int i = 0; i < nums.length; i++){
			Node n = new Node(nums[i]);
			add(n);
		}
	}
	
	public void add(Node num)
	{
		heap.add(num);
		int currentIndex = heap.size() - 1;
		
		while(currentIndex > 0)
		{
			int parentIndex = (currentIndex - 1)/2;
			if(heap.get(currentIndex).data > heap.get(parentIndex).data)
			{
				Node temp = heap.get(currentIndex);
				heap.set(currentIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
			}else{
				break;
			}
			currentIndex = parentIndex;
		}
	}
	
	public Node deleteMax()
	{
		if(heap.size() == 0)
			return null;
		Node removedNum = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int currentIndex = 0;
		while(currentIndex < heap.size())
		{
			int leftChild = 2 * currentIndex + 1;
			int rightChild = 2 * currentIndex + 2;
			
			if(leftChild >= heap.size())
				break;
			
			int maxIndex = leftChild;
			if(rightChild < heap.size())
			{
				if(heap.get(maxIndex).data < heap.get(rightChild).data)
				{
					maxIndex = rightChild;
				}
			}
			if(heap.get(currentIndex).data < heap.get(maxIndex).data)
			{
				Node temp = heap.get(maxIndex);
				heap.set(maxIndex, heap.get(currentIndex));
				heap.set(currentIndex, temp);
				currentIndex = maxIndex;
			}else{
				break;
			}
		}
		return removedNum;
	}
	
	public Node getRoot()
	{
		return heap.get(0);
	}
	
	public int getSize()
	{
		return heap.size();
	}
	
	public void inOrder(Node root)
	{	
		if(root == null) return;
		
		try{
			int currentLeftChildPosition = 2*heap.indexOf(root)+1;
			inOrder(heap.get(currentLeftChildPosition));
			
		}catch(Exception e){}
		
		System.out.println(root.data + "\n");
		
		try{
			int currentRightChildPosition = 2*heap.indexOf(root)+2;
			inOrder(heap.get(currentRightChildPosition));
		}catch(Exception e){}
		
	}
	public void display()
	{
		this.inOrder(this.getRoot());
		
	}
	
}
