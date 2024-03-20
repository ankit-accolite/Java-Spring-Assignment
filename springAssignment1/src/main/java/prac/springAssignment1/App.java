package prac.springAssignment1;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
    	Student obj1 = (Student)context.getBean("sid1");
		System.out.println(obj1);
		for(Map.Entry<String,Integer> mrk : obj1.getMarks().entrySet())
			System.out.println(mrk.getKey()+" : "+mrk.getValue());
		
		Student obj2 = (Student)context.getBean("sid2");
		System.out.println(obj2);
		for(Map.Entry<String,Integer> mrk : obj2.getMarks().entrySet())
			System.out.println(mrk.getKey()+" : "+mrk.getValue());

		Student obj3 = (Student)context.getBean("sid3");
		System.out.println(obj3);
		for(Map.Entry<String,Integer> mrk : obj3.getMarks().entrySet())
			System.out.println(mrk.getKey()+" : "+mrk.getValue());
    }
}
