package ListConcept;

import java.util.ArrayList;

class Container<T extends Number>
{
	T value;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public void demoExtends(ArrayList<? extends Number> obj) {

	}
	public void demoSuper(ArrayList<? super Float> obj) {

	}
	public void demoExtendsT(ArrayList<? extends T> obj) {

	}
}
public class JavaGenericsTelusko {

	public static void main(String[] args) {
		Container<Number> intValue = new Container<Number>();
		//Container<String> stringValue = new Container<String>()  --> Gives compile time error.

		intValue.demoExtends(new ArrayList<Float>());
		
		intValue.demoSuper(new ArrayList<Number>());
		
		intValue.demoExtendsT(new ArrayList<Integer>());
	}
}