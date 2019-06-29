package CoreJavaBlackBookCollections;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		AnonymousClass obj1 = new AnonymousClass() {
			public void show() {
				System.out.println("Hi");		
			}
		};
		obj1.show();
		
	}
}

class AnonymousClass{

	//Inorder to override this to print "Hi" we have two methods
	// 1. Implementing child class for AnonymousClass and override method of show().
	// 2. using AnonymousClass which has been written in main() method.
	public void show() {
		System.out.println("Hello");		
	}
}
