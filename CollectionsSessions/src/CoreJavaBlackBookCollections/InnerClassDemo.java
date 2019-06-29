package CoreJavaBlackBookCollections;

//First method is to import
import CoreJavaBlackBookCollections.A.B;

public class InnerClassDemo {

	public static void main(String[] args) {

		A obj = new A();
		obj.empId = 101;
		obj.empName = "A";
		
		//Member Inner Class.(Method 1 : import CoreJavaBlackBookCollections.A.B)
	    B obj1 = obj.new B();
		obj1.show();
		
		//Member Inner Class.(Method 2 : A.B -> which says B Class is belongs to A)
	    A.B obj2 = obj.new B();
		obj2.show();
		
		//Static Inner Class.
		A.C obj3 = new A.C();
		obj3.show();
	}
}
class A{
	int empId;
	String empName;
	class B{
		void show() {
			System.out.println(empId+" "+empName);
		}
	}
	static class C{
		void show() {
			System.out.println("I'm the memeber of class C");
		}
	}
}
