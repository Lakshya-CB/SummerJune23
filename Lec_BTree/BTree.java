package Lec_BTree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.println(nn.data);
		print(nn.left);
		print(nn.right);
	}

	public BTree(int[] pre, int[] in) {
		// TODO Auto-generated constructor stub
		root = createPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node createPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		System.out.println(nn.data + " -- ");
		int f = -1;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			L_size++;

		}

		nn.left = createPreIn(pre, ps + 1, ps + L_size, in, is, f - 1);
		nn.right = createPreIn(pre, ps + 1 + L_size, pe, in, f + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int global = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int self = L + R + 2;
		boolean self_isBal = Math.abs(L - R) <= 1;

		global = Math.max(global, self);
		return 1 + Math.max(L, R);
	}

	public int Dia() {
//		return Dia(root);
		return Dia2(root).Dia;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(Math.max(L, R), self);
	}

	class pair {
		int Dia = 0;
		int Ht = -1;
	}

	private pair Dia2(Node nn) {
		if (nn == null) {
			return new pair();
		}
		pair L = Dia2(nn.left);
		pair R = Dia2(nn.right);
		int self = L.Ht + R.Ht + 2;

//		###########################
		pair ans = new pair();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.Dia = Math.max(Math.max(L.Dia, R.Dia), self);
		return ans;

	}

	int p_idx = 0;

	public BTree(int[] pre) {
		p_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (p_idx >= pre.length || pre[p_idx] == -1) {
			p_idx++;
			return null;
		}
		Node nn = new Node(pre[p_idx]);
		p_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public void lvlPrint() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_size = 1;
//		while(!Q.isEmpty()) {
		while (curr_size > 0) {
			for (int cnt = 1; cnt <= curr_size; cnt++) {
				Node nn = Q.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}
			}
			curr_size = Q.size();
			System.out.println();
		}
	}

	public BTree(int[] lvl, boolean b) {
		root = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<>();
		int idx = 1;
		while (idx < lvl.length && !Q.isEmpty()) {
			Node nn = Q.poll();
			if (lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}

	public boolean isBal() {
		return isBal2(root).isBal;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		return L && R && self;
	}

	class isBalPair {
		boolean isBal = true;
		int Ht = -1;
	}

	private isBalPair isBal2(Node nn) {
		if (nn == null) {
			return new isBalPair();
		}
		isBalPair L = isBal2(nn.left);
		isBalPair R = isBal2(nn.right);
		boolean self = Math.abs(L.Ht - R.Ht) <= 1;
		isBalPair ans = new isBalPair();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.isBal = L.isBal && R.isBal && self;
		return ans;
	}

	public boolean isBST() {
		return isBST(root).isBST;
	}

	class isBSTPair {
		boolean isBST = true;
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
	}

//	private boolean isBST(Node nn) {
//		if(nn==null) {
//			return true;
//		}
//		boolean L = isBST(nn.left);
//		boolean R = isBST(nn.right);
//		boolean self = Max(nn.left) <nn.data && Min(nn.right)>nn.data;
//		return L && R && self;
//	}
	private isBSTPair isBST(Node nn) {
		if (nn == null) {
			return new isBSTPair();
		}
		isBSTPair L = isBST(nn.left);
		isBSTPair R = isBST(nn.right);

		isBSTPair ans = new isBSTPair();
		ans.Min = Math.min(L.Min, nn.data);
		ans.Max = Math.max(R.Max, nn.data);
//		#########################
		boolean self = L.Max < nn.data && R.Min > nn.data;

//		###########################
		ans.isBST = L.isBST && R.isBST && self;

		return ans;
	}

	public void addBST(int ali) {
		root = addBST(root, ali);
	}

	private Node addBST(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data > ali) {
			nn.left = addBST(nn.left, ali);
		} else {
			nn.right = addBST(nn.right, ali);
		}
		return nn;
	}

	public void removeBSTNode(int ali) {
		root = remove(root, ali);

	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
		} else if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
		} else {
//			/////////////////////
//			c1 => nn is leaf!!
			if (nn.left == null && nn.right == null) {
				return null;
			}else if(nn.left==null && nn.right!=null) {
				return nn.right;
			}else if(nn.left!=null && nn.right== null) {
				return nn.left;
			}else {
//				step 1) replace it with min from right sub tree!!1
				nn.data = Min(nn.right);
//				////////
//				delete karo nn.data from nn.right
				nn.right = remove(nn.right, nn.data);
			}
		}
		return nn;
	}

	private int Min(Node nn) {
		if(nn.left==null) {
			return nn.data;
		}
		return Min(nn.left);
	}
}
