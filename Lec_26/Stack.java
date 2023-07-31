package Lec_26;

public class Stack {
	@Override
	public String toString() {
		System.err.println("?");
		return "";
	}
	public int[] arr;
	public int tos;
	public Stack() {
		this(5);
	}
	public Stack(int cap) {
		tos = -1;
		arr = new int[cap];
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("kya daal rha hein??");
			
		}
		arr[tos+1] = ali;
		tos++;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("kya, deekh rha hein?");
		}
		return arr[tos];
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Kya nikaal rha hein ?");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public int size() {
		return tos+1;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isFull() {
		return size()==arr.length;
	}
	public void print() {
		int i = tos;
		for(;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
