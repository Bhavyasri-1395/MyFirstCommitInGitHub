package SortingAlgorithms;

public class StringBuilderStringBuffer {

	public static void main(String[] args) {
		
		String string = "Hello";
		StringBuilder stringBuilder = new StringBuilder("Hello");
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		string.concat("hi..");
		stringBuilder.append("hi...");
		stringBuffer.append("hi...");
//		System.out.println(string);
//		System.out.println(stringBuilder);
//		System.out.println(stringBuffer);
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		if(str1.equals(str2)) {
			System.out.print("same");
		}else {
			System.out.println("Not sames");
		}
	}

}
