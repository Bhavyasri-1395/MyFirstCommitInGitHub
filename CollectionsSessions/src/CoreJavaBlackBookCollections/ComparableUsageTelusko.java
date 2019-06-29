package CoreJavaBlackBookCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUsageTelusko {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList();

		studs.add(new Student("A",12));
		studs.add(new Student("B",45));
		studs.add(new Student("C",20));
		studs.add(new Student("D",65));
		studs.add(new Student("E",03));

		System.out.println("Using Comparator inteface");
		Collections.sort(studs, (s1,s2)->{
			return s1.marks>s2.marks?1:-1;
		});
		
		for(Student s:studs) {
			System.out.println(s);
		}
		
		System.out.println("Using Comparable inteface");
		Collections.sort(studs);
		for(Student s:studs) {
			System.out.println(s);
		}
	}
}
class Student implements Comparable<Student>{
	String sname;
	int marks;
	public Student(String sname, int marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		return this.marks>s.marks?1:this.marks<s.marks?-1:0;
	}
}
