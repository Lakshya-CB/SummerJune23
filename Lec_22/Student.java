package Lec_22;

public class Student {
//	properties and data members!
	private int Age = 0;
	private String Name = "chottu";

	public int getAge() {
		return Age;
	}

	public String getName() {
		return Name;
	}

	public void setAge(int age) {
		if(age>=0) {
			Age = age;
		}else {
			throw new RuntimeException("bhai, mat kar esse");
		}
		
	}

	public void Intro() {
		System.out.println(this);
		System.out.println(this.Name + " - " + this.Age);
	}

	Student(String s, int A) {
		Name = s;
		Age = A;
	}

	public Student() {
		this("??????", -1);
	}

//	s1.partyWith(s2.Name)
	public void partyWith(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
}
