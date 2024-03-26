package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class exec {

    @Around("execution(* prac.springBootAssignment4.Triangle.draw())")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    	
        long initialtime = System.currentTimeMillis();
        Object exec_time = joinPoint.proceed();
        long finaltime = System.currentTimeMillis();
        long total_time_taken = finaltime - initialtime;
        System.out.println("Total time taken : " + total_time_taken + " ms");
        return exec_time;
    }
}
