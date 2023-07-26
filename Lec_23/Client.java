package Lec_23;

public class Client {
	public static void main(String[] args) {
//		child c = new child();
//		System.out.println();
//		parent p = new parent();
//		System.out.println(p.);
		
//		case 1!!
		child c1 = new child();
		System.out.println(c1.dataC);
		System.out.println(c1.dataP);
		System.out.println(c1.data);
		System.out.println(((parent)c1).data);
		
		c1.partyP();
		c1.partyC();
		
		c1.party();
		((parent)c1).party();
		System.out.println("===============");
		////////////////////////////////
//		case 2!!
		parent p2 = new child();
	

		System.out.println(p2.dataP);
		System.out.println(p2.data);
		System.out.println(((child)p2).data);
		
		p2.party();
		((child)p2).party();
		
		/////////////////////
//		child c3 = new parent();
		
		
	}
}
