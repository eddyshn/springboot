package com.example.eddy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-25 11:16
 **/
@Component
@Aspect
public class LogComponent {
    //返回值任意 包.任意类.任意方法(参数类型,个数任意)
    @Pointcut("execution(* com.example.eddy.serevice.*.*(..))")
    public void pointCut(){
        System.out.println("pointCut");
    }

    @Before(value = "pointCut()")
    public void before(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println("before>>>>>>>>>>>");
    }

    @After(value = "pointCut()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println("After>>>>>>>>>>>>"+name);
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result){
        String name = jp.getSignature().getName();
        System.out.println("AfterReturning>>>>>>>>>>>>"+ name +">>>>>>>>>>>" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void after(JoinPoint jp, Exception e){
        String name = jp.getSignature().getName();
        System.out.println("After>>>>>>>>>>>>"+ name + ">>>>>>>>>>>>>>" + e.getMessage());
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        String name = pjp.getSignature().getName();
        System.out.println("Around>>>>>>>>>>>>" + name);

        Object proceed = pjp.proceed();

        return proceed;
    }
}
