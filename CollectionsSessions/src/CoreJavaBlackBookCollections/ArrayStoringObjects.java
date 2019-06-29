package CoreJavaBlackBookCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStoringObjects {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee arr[] = new Employee[5];
		for(int i=0;i<5;i++) {
              System.out.println("Enter the id:");
              int id = Integer.parseInt(br.readLine());
              
              System.out.println("Enter the name:");
              String name = br.readLine();
              
              arr[i] = new Employee(id,name);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].displayData();
		}
	}
}

class Employee{
	int id;
	String name;
	
	Employee(int eid,String ename){
		id= eid;
		name = ename;
	}
	
	void displayData() {
		System.out.println(id+" : "+name);
	}
}