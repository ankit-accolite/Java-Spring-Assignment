package prac.springAssignment2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("prac/springAssignment2/config.xml");
	  Employee obj = (Employee)context.getBean("emp1");
	  System.out.println(obj);
  }
}
