package Lec_26;

public class MinStack extends Dynamic_Stack {
	int curr_min = 0;

	public int getMin() {
		return curr_min;
	}

	@Override
	public void add(int ali) {
		if (size() == 0) {
			curr_min = ali;
		}
		if (ali >= curr_min) {
			super.add(ali);
		} else {
			int prev_min = curr_min;
			curr_min = ali;
			int M = 2 * curr_min - prev_min;
			super.add(M);
		}
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if (super.peek() < curr_min) {
			return curr_min;
		} else {
			return super.peek();
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (super.peek() >= curr_min) {
			return super.pop();
		} else {
			int M = super.pop();
			int prev_min = 2 * curr_min - M;
			int ans = curr_min;
			curr_min = prev_min;
			return ans;
		}
	}
}
