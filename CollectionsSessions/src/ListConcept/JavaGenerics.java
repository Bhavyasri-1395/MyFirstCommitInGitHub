package ListConcept;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.SetOverrideType;

class JavaGenerics{
	
	public static void main(String[] args) {
		
		//Without Generic method.
		DemoClassWithoutGenerics demoClassWithoutGenerics1 = new DemoClassWithoutGenerics();
		DemoClassWithoutGenerics demoClassWithoutGenerics2 = new DemoClassWithoutGenerics();
		
		demoClassWithoutGenerics1.setT("String Type");
		demoClassWithoutGenerics2.setT(1);
		
		System.out.println(demoClassWithoutGenerics1);
		System.out.println(demoClassWithoutGenerics2);
		
		//With Generics.
		DemoClass<String> demoClass = new DemoClass<String>();
		demoClass.setT("Bhavyasri");
		// demoClass.setT(1);  -->  Compile time error
		
		//Mistake we will generally do --> can overcome by using generics.
		Object[] obj1 = new String[10];
		obj1[0] = "bhavayasri";
		obj1[1] = 1;
	}
}

//with Generics.
class DemoClass<T>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

//Without Generics.
class DemoClassWithoutGenerics{
	private Object t;
	
	public void setT(Object t) {
		this.t= t;
	}
	public Object getT() {
		return t;
	}
	@Override
	public String toString() {
		return "DemoClassWithoutGenerics [t=" + t + "]";
	}
}