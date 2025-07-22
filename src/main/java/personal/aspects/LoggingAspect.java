package personal.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.MyService.performAction(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before method execution");
    }
}
