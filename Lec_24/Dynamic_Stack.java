package Lec_24;

public class Dynamic_Stack extends Stack {
	@Override
	public void add(int ali) {
		if(isFull()) {
//			
			int[] old = arr;
			arr =new int[old.length*2];
			for(int i=0;i<=tos;i++) {
				arr[i] = old[i]; 
			}
		}
		super.add(ali);
	}
	public int ll(int... a) {
		int ans =0;
		for(int ali: a) {
			ans = ans+ali;
		}
		return ans;
	}
}
