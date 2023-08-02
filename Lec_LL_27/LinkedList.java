package Lec_LL_27;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (isEmpty() || idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int alio) {
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("Kaha daal rha hein?");

		}
		if (idx == 0) {
			addFirst(alio);
		} else if (idx == size()) {
			addLast(alio);
		} else {

			Node prev = getNodeAt(idx - 1);
			Node after = prev.next;
			Node nn = new Node(alio);
			prev.next = nn;
			nn.next = after;
		}
	}

	private Node getNodeAt(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya nikaal rha hein?");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeLast() {
		if (size() <= 1) {
			return removeFirst();
		}

		Node second_last = getNodeAt(size() - 2);
		Node last = second_last.next;
		second_last.next = null;
		return last.data;
	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya nikaal rha hein?");
		}
		if (idx == 0) {
			return removeFirst();
		}
		if (idx == size() - 1) {
			return removeLast();
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		return curr.data;
	}

	public void Reverse() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;

			curr.next = prev;
			////
			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void Rev2() {
		Rev2(head);
	}

	private Node Rev2(Node nn) {
		if (nn.next == null) {
			head = nn;
			return nn;
		}
		Node Tail = Rev2(nn.next);
		Tail.next = nn;
		nn.next = null;
		return nn;
	}

	public void K_Rev(int k) {
		Node temp = head;
		Stack<Node> S = new Stack<>();
		Node nhead = null;
		Node ntail = null;
		while (temp != null) {
			Node after = temp.next;
			S.add(temp);
			if (S.size() == k) {
				while (!S.isEmpty()) {
					Node nn = S.pop();
//					new linkedList ke last mein daal do!!
					if (nhead == null) {
						nhead = nn;
						ntail = nn;
						ntail.next = null;
					} else {
						ntail.next = nn;
						ntail = nn;
						ntail.next = null;
					}
				}
			}

			temp = after;
		}
		head = nhead; 
	}
	public int getMid() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow  = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	public boolean detectCycle() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow  = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	
	}
}
