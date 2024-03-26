package prac.springBootAssignment4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {     
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TriangleConfig.class);
        Triangle triangle = (Triangle) context.getBean(Triangle.class);
        triangle.setBase(115);
        triangle.setHeight(100);
        triangle.draw();
        context.close();
    }
}