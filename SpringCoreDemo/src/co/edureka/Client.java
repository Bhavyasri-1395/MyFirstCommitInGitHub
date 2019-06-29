package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
//		Employee eRef = new Employee();
//		eRef.setEid(101);
//		eRef.setEaddress("Hyderabad");
//		eRef.setEname("Bhavyasri");
//		
//		System.out.println("Employee Details: "+eRef);
		
		//IOC
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		
		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2",Employee.class);
		
//		Employee e1 = (Employee)context.getBean("emp1");
//		Employee e2 = context.getBean("emp2",Employee.class); 
		
		System.out.println("Employee1 Details: "+e1);
//		System.out.println("Employee2 Details: "+e2);
		
//		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
//		cxt.close();
	}
}
