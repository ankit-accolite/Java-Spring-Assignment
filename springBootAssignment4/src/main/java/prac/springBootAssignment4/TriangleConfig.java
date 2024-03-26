package prac.springBootAssignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"prac.springBootAssignment4","aspect"})
public class TriangleConfig {
    @Bean
    public Triangle triangle() {
    	return new Triangle();
    }
}