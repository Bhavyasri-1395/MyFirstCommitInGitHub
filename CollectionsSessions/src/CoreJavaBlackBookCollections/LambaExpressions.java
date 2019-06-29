package CoreJavaBlackBookCollections;

 
public class LambaExpressions {

	public static void main(String[] args) {
		
		//Now in order to write implement the method of show() in interface Lambda we have two ways
		//1. Create a class that implements interface Lambda
		//2. Using InnerClass.
		
		//Method: 1 [ Create a class that implements interface Lambda ]
		Lambda obj1 = new X();
		obj1.show();
		
		//Method: 2 [ Using InnerClass ]
		Lambda obj2 = new Lambda()
		{
			public void show() {
				System.out.println("Method: 1 [  Create a class that implements interface Lambda ]");
				
			}
		};
		obj2.show();
		//Method 2
		Lambda obj3 = () -> {
						System.out.println("Method: 2 [ InnerClass Lamba expressions]");
						
		};
		obj3.show();
	}
}

//FunctionalInterface annoted interface will has only one abstract class to implement.
//@FunctionalInterface
interface Lambda{
	void show();
}

//now inorder to write implement the method of show() in interface Lamba we have to ways
//1. Create a class that implements interface Lamba
//2. Using InnerClass.

//Method 1
class X implements Lambda{

	@Override
	public void show() {
		System.out.println("Method: 1 [  Create a class that implements interface Lambda ]");
		
	}
	
}