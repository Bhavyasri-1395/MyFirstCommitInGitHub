package ListConcept;

public class WorkingOfToString {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Bhavyasri");
        System.out.println(s1);
	}
}

class Student{
	int rollno;
	String sname;
	
	Student(int rollno,String sname){
		this.rollno = rollno;
		this.sname = sname;
	}
	public String toString() {
		return rollno+":"+sname;
	}
}
